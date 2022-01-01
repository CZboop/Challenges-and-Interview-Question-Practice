class Solution {
    public int searchInsert(int[] nums, int target) {
        int binSearch = Arrays.binarySearch(nums, target);
        if (binSearch>-1){
            return binSearch;
        }
        else{
            return Math.abs(binSearch + 1);
        }   
    }
}