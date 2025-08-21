class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int val=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }

        return val-sum;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[100];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        int res=sol.missingNumber(nums);
        System.out.println(res);
    }
}
