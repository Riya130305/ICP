class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //int[] ans = new int[m+n]; 
        int r1=m-1;
        int r2=n-1;
        int w=m+n-1;
        while(r1>=0 && r2>=0){
        
        if(nums1[r1]>nums2[r2])
        {
            nums1[w--]=nums1[r1--];

        }
        else {
            nums1[w--]=nums2[r2--];
        }
        }
        while(r2>=0)
        {
            nums1[w--]=nums2[r2--];
        }
  
    }
}
