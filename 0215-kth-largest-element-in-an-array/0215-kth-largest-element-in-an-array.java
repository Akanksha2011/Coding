class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       for(int x : nums)
       {
        maxHeap.offer(x);
       }
       for(int i=1; i<k; i++)
       {
        maxHeap.poll();
       }
       return maxHeap.peek();
    }
}