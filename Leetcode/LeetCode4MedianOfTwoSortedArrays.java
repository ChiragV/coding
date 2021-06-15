
public class LeetCode4MedianOfTwoSortedArrays {

	public static void main(String[] args) {

		//int[] nums1 = {1,3}, nums2 = {2};
		findMedianSortedArrays(new int[] {1,2},new int[] {3,4});
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
		int i=0,j=0;
		int k=0;
		int[] result=new int[nums1.length+nums2.length];
		while(i<nums1.length && j<nums2.length)
		{
			if(i>=nums1.length)
				result[k]=nums2[j];
			if(j>=nums2.length)
				result[k]=nums2[i];
		}
		return 0;
    }
}
