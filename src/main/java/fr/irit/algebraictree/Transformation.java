package fr.irit.algebraictree;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Transformation extends TreeNode {
    private TreeNode child;
    private String sourceDatabaseType;
    private String targetDatabaseType;
    public Transformation(String sourceDatabase, String targetDatabase){
        this.sourceDatabaseType = sourceDatabase;
        this.targetDatabaseType = targetDatabase;
    }

    @Override
    public String toString() {
        return this.sourceDatabaseType + " -> " + this.targetDatabaseType;
    }
    @Override
    public List<String> listIncludedTablesRecursive() {
        return this.child.listIncludedTablesRecursive();
    }
    @Override
    public TreeNode findLowestNodeContainingTables(List<String> tableList) {
        if(!this.listIncludedTablesRecursive().containsAll(tableList)){
            return null;
        } else {
            return this.child.findLowestNodeContainingTables(tableList);
        }
    }
    @Override
    public Set<DotNotation> listDistinctColumnsRecursive() {
        return child.listDistinctColumnsRecursive();
    }
    @Override
    public void addChildren(TreeNode... children) {
        if(children.length == 1){
            this.child = children[0];
            this.child.setParent(this);
        } else {
            throw new UnsupportedOperationException("A Transfer node can only have 1 child");
        }
    }
    @Override
    public void print(String prefix) {
        if(this.getParent() instanceof Join){
            System.out.print(prefix + "├── Transformation : " +this.toString() + "\n");
        } else {
            System.out.print(prefix + "└── Transformation : " +this.toString() + "\n");
        }
        this.child.print(prefix + "    ");
    }
    @Override
    public void renameColumnsRecursive(Map<DotNotation, DotNotation> columnNamingMap) {
        this.child.renameColumnsRecursive(columnNamingMap);
    }
}