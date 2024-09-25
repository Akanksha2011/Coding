class Solution {
    public int firstOcc(int arr[], int x)
    {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == x)
            {
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid] > x)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
    public int LastOcc(int[] arr, int x)
    {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == x)
            {
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid] > x)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstOcc(nums,target);
        ans[1] = LastOcc(nums,target);
        return ans;
    }
}