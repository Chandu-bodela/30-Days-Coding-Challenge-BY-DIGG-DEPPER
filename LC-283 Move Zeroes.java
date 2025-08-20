class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){

                nums[index++]=nums[i];
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[100];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();

        }
        Solution sol=new Solution();
        sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
