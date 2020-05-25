class Solution
{
    public TreeNode bstFromPreorder(int[] A)
	{
        return bstFromPreorderHelper(A, 0, A.length);
    }

    private TreeNode bstFromPreorderHelper(int[] A, int start, int end)
	{
        if(start >= end)
		{
			return null;
		}
		else
		{
			int transitionPoint = start + 1;
			
			while(transitionPoint < end && Integer.compare(A[transitionPoint], A[start]) < 0)
				transitionPoint++;
			
			TreeNode root = new TreeNode(A[start]);
			root.left = bstFromPreorderHelper(A, start + 1, transitionPoint);
			root.right = bstFromPreorderHelper(A, transitionPoint, end);
			return root;
		}
    }
}