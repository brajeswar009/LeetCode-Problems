class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // last non zero element of nums1 array
        int i = m - 1;
        // last element of nums2 array
        int j = n - 1;
        // last index of nums1 array
        int k = m + n - 1;

        // running the conditon till all the element of nums2 array are traversed
        while (j >= 0) {
            // if the last non zero element of nums1 array bigger than last element
            // of nums2 then put nums1 element in the last position of nums1 and move the i
            // and k pointer
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            // if the last non zero element of nums1 array smaller than last element
            // of nums2 then put nums2 element in the last position of nums1 and move the j
            // and k pointer
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}