package fr.irit.algebraictree;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Join  extends TreeNode{
    //region ATTRIBUTES
    private TreeNode leftChild;
    private TreeNode rightChild;
    private DotNotation[] condition;
    //endregion
    //region CONSTRUCTOR
    public Join(DotNotation leftCondition, DotNotation rightCondition) {
        this.condition = new DotNotation[]{leftCondition, rightCondition};
    }
    //endregion
    //region GETTERS & SETTERS
    public TreeNode getLeftChild() {
        return leftChild;
    }
    public TreeNode getRightChild() {
        return rightChild;
    }
    public DotNotation[] getCondition() {
        return condition;
    }
    //endregion
    //region METHODS

    /**
     *
     * @param children (leftChild, rightChild)
     */
    @Override
    public void addChildren(TreeNode... children) {
        if(children.length == 2){
            this.leftChild = children[0];
            this.rightChild = children[1];
            leftChild.setParent(this);
            rightChild.setParent(this);
        } else {
            throw new  UnsupportedOperationException("A Projection node should have 2 children");
        }
    }

    @Override
    public void print(String prefix) {
        System.out.print(prefix + "└── ⨝ " + this.toString() + "\n");
        this.rightChild.print(prefix + "    ");
        this.leftChild.print(prefix + "    ");
    }

    @Override
    /**
     * Don't rename because Join columns name should be the same on unified view and real implementation
     */
    public void renameColumnsRecursive(Map<DotNotation, DotNotation> columnNamingMap) {
        this.leftChild.renameColumnsRecursive(columnNamingMap);
        this.rightChild.renameColumnsRecursive(columnNamingMap);
    }

    @Override
    public String toString(){
        return this.condition[0].toString() + " = " + this.condition[1].toString();
    }

    @Override
    public List<String> listIncludedTablesRecursive() {
        List<String> tmpList =  this.leftChild.listIncludedTablesRecursive();
        tmpList.addAll(this.rightChild.listIncludedTablesRecursive());
        return tmpList;
    }

    /**
     * A Join node can be the lowest node which contain n tables.
     * Or one of its children may be the lowest
     * @return null or itself or result of the same method on one of its children
     */
    @Override
    public TreeNode findLowestNodeContainingTables(List<String> tableList) {
        if(!this.listIncludedTablesRecursive().containsAll(tableList)){
            return null;
        } else if(this.leftChild.listIncludedTablesRecursive().containsAll(tableList) && this.rightChild.listIncludedTablesRecursive().containsAll(tableList)){
            return this; // case at module 2 when tables are duplicated
        } else if(this.leftChild.listIncludedTablesRecursive().containsAll(tableList)){
            return this.leftChild.findLowestNodeContainingTables(tableList);
        } else if(this.rightChild.listIncludedTablesRecursive().containsAll(tableList)){
            return this.rightChild.findLowestNodeContainingTables(tableList);
        } else {
            return this;
        }
    }
    @Override
    public Set<DotNotation> listDistinctColumnsRecursive() {
        Set<DotNotation> includedColumns = new HashSet<>();
        for (DotNotation condition : this.condition){
            includedColumns.add(condition);
        }
        if(leftChild.listDistinctColumnsRecursive() != null) {
            includedColumns.addAll(leftChild.listDistinctColumnsRecursive());
        }
        if (rightChild.listDistinctColumnsRecursive() != null) {
            includedColumns.addAll(rightChild.listDistinctColumnsRecursive());
        }
        return includedColumns;
    }
    //endregion
}
