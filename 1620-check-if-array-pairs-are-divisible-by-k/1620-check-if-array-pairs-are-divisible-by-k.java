class Solution {
    public boolean canArrange(int[] arr, int k) {
       int[] remaindercount = new int[k];
       for(int num : arr)
       {
        int remainder = ((num % k) + k)%k;
        remaindercount[remainder]++;
       } 
       if(remaindercount[0]%2 != 0)
       {
        return false;
       }
       for(int i=1; i<=k/2; i++)
       {
        if(remaindercount[i] != remaindercount[k-i])
        {
            return false;
        }
       }
       return true;
    }
}