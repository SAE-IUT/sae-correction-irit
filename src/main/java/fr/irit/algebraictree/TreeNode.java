package fr.irit.algebraictree;

import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class TreeNode {

    //region ATTRIBUTES
    private TreeNode parent;
    //endregion
    //region GETTERS & SETTERS oui
    public TreeNode getParent() { return this.parent; }
    public void setParent(TreeNode parent) { this.parent = parent; }
    //endregion
    //region METHODS
    public boolean isRoot() {
        return this.parent == null;
    }
    public abstract String toString();
    /**
     * Return a list of tables included in the node and its children
     * This method is called recursively on its child nodes
     */
    public abstract List<String> listIncludedTablesRecursive();

    /**
     * @param tableList List of table names searched
     * @return Lowest node which containing all tables specified in param
     */
    public abstract TreeNode findLowestNodeContainingTables(List<String> tableList);

    /**
     * @return List of columns ('table.column') included in the node and its children
     */
    public abstract Set<DotNotation> listDistinctColumnsRecursive();
    public abstract void addChildren(TreeNode... children);
    public abstract void print(String prefix);
    public abstract void renameColumnsRecursive(Map<DotNotation, DotNotation> columnNamingMap);
    //TODO rename table also ?
    //endregion
}
