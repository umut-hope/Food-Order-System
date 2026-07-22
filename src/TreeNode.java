import java.util.ArrayList;
import java.util.List;

class TreeNode {
    String categoryName;
    List<MenuItem> menuItems;
    List<TreeNode> children;

    public TreeNode(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public void addChild(TreeNode child) {
        children.add(child); // Add the child TreeNode to the list
    }

        public MenuItem findItem(String itemName) {
        TreeNode root = null;
        return findItem(root, itemName);
        }

        private MenuItem findItem(TreeNode node, String itemName) {
            for (MenuItem item : node.menuItems) {
                if (item.name.equalsIgnoreCase(itemName)) {
                    return item;
                }
            }

            for (TreeNode child : node.children) {
                MenuItem foundItem = findItem(child, itemName);
                if (foundItem != null) {
                    return foundItem;
                }
            }

            return null;
        }
    }