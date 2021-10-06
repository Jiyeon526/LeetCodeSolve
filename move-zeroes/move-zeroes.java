class Solution {
    public void moveZeroes(int[] nums) {
        
        int indexOfZero=-1;
        
        //맨처음 0을 찾아서 index값 가져온다.
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]==0){
                indexOfZero=i;
                break;
            }
        }
        
        //0이 없으면 그대로 리턴
        if(indexOfZero==-1) return;
        
        //0이 있는곳으로 뒤에서 0이 아닌수를 가져오고 index를 하나 늘린다(반복)
        for(int i=indexOfZero ; i<nums.length ; i++) {
            if(nums[i]==0) continue;
            nums[indexOfZero]=nums[i];
            nums[i]=0;
            indexOfZero++;
        }
    }
}
