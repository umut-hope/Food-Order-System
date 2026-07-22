class RestaurantMenu {
    private TreeNode root;

    public RestaurantMenu() {
        root = new TreeNode("Menu");
    }

    public void addItem(String category, MenuItem item) {
        TreeNode categoryNode = findOrCreateCategoryNode(root, category);
        categoryNode.addItem(item);
    }

    private TreeNode findOrCreateCategoryNode(TreeNode node, String category) {
        if (node.categoryName.equals(category)) {
            return node;
        }

        for (TreeNode child : node.children) {
            TreeNode found = findOrCreateCategoryNode(child, category);
            if (found != null) {
                return found;
            }
        }

        TreeNode newCategory = new TreeNode(category);
        node.addChild(newCategory);
        return newCategory;
    }

    public void printMenu() {
        printMenu(root, 0);
    }

    private void printMenu(TreeNode node, int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("  ");
        }

        System.out.println(indent + node.categoryName);
        for (MenuItem item : node.menuItems) {
            System.out.println(indent + "  - " + item.name + "    $" + item.price);
        }

        for (TreeNode child : node.children) {
            printMenu(child, level + 1);
        }
    }

    public MenuItem findItem(String itemName) {
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