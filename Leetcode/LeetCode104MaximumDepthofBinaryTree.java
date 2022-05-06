import static org.junit.Assert.assertEquals;

class TreeNode1
{
    int val;
    TreeNode1 left;
    TreeNode1 right;

    public String toString()
    {
        return this.val + "=>";
    }

    TreeNode1()
    {
    }

    TreeNode1(int val)
    {
        this.val = val;
    }

    TreeNode1(int val, TreeNode1 left, TreeNode1 right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LeetCode104MaximumDepthofBinaryTree
{


    public static void main(String[] args)
    {
        TreeNode1 three = new TreeNode1(3);
        TreeNode1 nine = new TreeNode1(9);
        TreeNode1 twenty = new TreeNode1(20);
        TreeNode1 fifteen = new TreeNode1(15);
        TreeNode1 seven = new TreeNode1(7);
        three.left = nine;
        three.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;
        assertEquals(3, maxDepth1(three));
        assertEquals(3, maxDepth2(three));
    }
    
    public static int maxDepth1(TreeNode1 root)
    {
        if (root == null)
            return 0;
        int right = maxDepth1(root.left);
        int left = maxDepth1(root.right);
        return Math.max(right, left) + 1;


    }

    public static int maxDepth2(TreeNode1 root)
    {
        return helper(root, 0);
    }

    private static int helper(TreeNode1 root, int i)
    {
        if (root == null)
            return i;

        int left = helper(root.left, i + 1);
        int right = helper(root.right, i + 1);
        return Math.max(left, right);
    }
}
