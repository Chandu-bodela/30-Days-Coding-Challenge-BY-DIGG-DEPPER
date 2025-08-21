class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
           
               if(nums[i]==nums[i-1]){
                return true;
               } 
               
            
        }return false;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[100];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        boolean res=sol.containsDuplicate(nums);
        System.out.println(res);
    }
}
