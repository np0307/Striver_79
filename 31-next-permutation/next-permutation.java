class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int checkIndex=-1;

        for(int i = n-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                checkIndex=i-1;
                break;
            }
        }

        if(checkIndex!=-1)
        {
            int swap_index=checkIndex;
            for(int j=n-1;j>=0;j--)
            {
                if(nums[j]>nums[checkIndex])
                {
                    swap_index= j;
                    break;
                }
            }

            swap(nums, checkIndex, swap_index);
        }

        reverse(nums, checkIndex+1,n-1);
        
    }
     
        private void swap(int[] nums, int i,int j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        private void reverse(int[] nums, int start ,int end)
        {
            while (start < end)
            {
                swap (nums,start,end);
                start++;
                end--;
            }
        }

    
}