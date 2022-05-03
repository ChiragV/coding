public class LeetCode33SearchInRotatedSortedArray
{
    public static void main(String[] args)
    {
        search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
    }


    public static int search(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (nums[mid] == target)
                return mid;

            //left part is sorted, notice equal to sign here
            if (nums[low] <= nums[mid])
            {
                //target is in 1st sorted part. notice equal sign
                if (nums[low] <= target && target < nums[mid])
                {
                    high = mid - 1;
                } else
                    low = mid + 1;
            } else //right part is sorted
            {
                //target is in 2nd sorted part. notice equal sign
                if (nums[mid] < target && target <= nums[high])
                {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
