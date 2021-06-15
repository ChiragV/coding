/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1 :
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
public class LeetCode1TwoSum {

	public static void main(String[] args) 
	{
		int sum[]= {2,7,11,15};
		int target=9;
		int[] ans=twoSum(sum,target);
		System.out.println(ans[0] +":"+ans[1]);
		
	}

	 public static int[] twoSum(int[] nums, int target) 
	 {

		 int[] ans=new int[2];
		for(int i=0;i<nums.length;i++)
		{
			int toFind=target-nums[i];
			for(int j=i+1;j<nums.length;j++)
			{
				if(toFind==nums[j])
				{
					ans[0]=i;
					ans[1]=j;
					return ans;//make sure to return from here//break;
				}
			}
		}
		 return ans;   
	 }
}
