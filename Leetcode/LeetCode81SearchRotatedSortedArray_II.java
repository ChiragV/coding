public class LeetCode81SearchRotatedSortedArray_II
{
    public static void main(String[] args)
    {
        boolean result = new LeetCode81SearchRotatedSortedArray_II().search2(new int[]{1, 13, 1, 1, 1}, 13);
    }

    public boolean search1(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (target == nums[mid])
            {
                return true;
            }
            // check if left part is sorted or not
            if (nums[low] < nums[mid])
            {
                if (target < nums[low] || target > nums[mid])//4,5,6,0,1,2,3
                { // target is out of the left part boundary scope
                    low = mid + 1;

                } else
                {
                    // target lies within this left part
                    high = mid - 1;
                }
            } else if (nums[low] > nums[mid])
            {
                // right part is sorted
                if (target < nums[mid] || target > nums[high])
                {
                    high = mid - 1;
                } else
                {
                    // target lies within the right part boundaries
                    low = mid + 1;
                }
            } else
            {

                // duplicates
                low++; // => O(n) 111111112
            }

        }
        return false;
    }

    public boolean search2(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[low] < nums[mid])//left part is sorted
            {
                if (target < nums[mid])
                {
                    high = mid - 1;
                } else
                    low = mid + 1;
            } else if (nums[low] > nums[mid])//left part is not sorted
            {
                if (target > nums[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            } else
            {
                low++;
            }
        }
        return false;
    }
}
