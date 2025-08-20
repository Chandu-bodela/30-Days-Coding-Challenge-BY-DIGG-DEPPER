class Solution {
    public int sum(int num1, int num2) {
        int add=num1+num2;
        return add;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        Solution sol=new Solution();
        int res=sol.sum(num1,num2);
        System.out.println(res);
    }
}
