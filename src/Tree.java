public class Tree {
    private TreeNode root;

    public Tree (int data) {
        this.root = new TreeNode(data);
    }

    public void insert (int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public int getMin () {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return root.getMin();
    }

    public int getMax () {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return root.getMax();
    }

    public TreeNode get (int value) {
        if (root == null) return null;
        return root.get(value);
    }

    public TreeNode delete(TreeNode subTreeRoot, int value) {
        if (subTreeRoot == null) {
            return null;
        }

        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            if (subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            } else {
                subTreeRoot.setData(subTreeRoot.getRightChild().getMin());
                subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
            }
        }
        return subTreeRoot;
    }
}
