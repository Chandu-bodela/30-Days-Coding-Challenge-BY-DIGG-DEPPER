class Solution {
    public int[] getConcatenation(int[] nums) {
       
        int[] add=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
         add[i]=nums[i];

        }
        for(int i=0;i<nums.length;i++){
            add[nums.length+i]=nums[i];
        }
        return add;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]=new int [100];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        
        Solution sol=new Solution();
        int[] res=sol.getConcatenation(nums);
        System.out.println(res);
    }
}
