package nsd.jp.co;

public class Num {

    public static void main(String[] args) {

//        System.out.println(addDigits(35));
        int[] nums = null;
        System.out.println(nums);
        moveZeroes(nums);
        System.out.println(nums);
        
    }
    
//    public static int addDigits(int num) {
//        return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
//    }
//    
//    // Definition for a binary tree node.
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }
//     
//    
//    public int maxDepth(TreeNode root) {
//        if (root == null)
//            return 0;
//        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//    }
    
    
//    public int maxDepth(TreeNode root) {
//        if(root==null){
//            return 0;
//        }else{
//            int i = maxDepth(root.left);
//            int j = maxDepth(root.right);
//            return (i<j)?(j+1):(i+1);
//        }
//
//    }
    
    public static void moveZeroes(int[] nums) {

        for (int i=nums.length-1;i<=0;i--){
            int j= i;
            while (nums[j]==0) {
                int temp;
                temp = nums[j];
                nums[j]=nums[i];
                nums[i] = temp;
                break;
            }
            j--;
                
        }
    }
    

}
