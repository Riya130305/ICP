class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length==1)
        {
            return nums[0];
        }
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        pq.offer(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            pq.offer(nums[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        return pq.poll();
    }
}
