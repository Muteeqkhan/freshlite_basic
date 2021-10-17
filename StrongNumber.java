class StrongNumber{
	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int sum=0, rem;
		int fact;
		while(num>0){
			fact=1;
			rem=num%10;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			num/=10;
		}
		if(temp==sum){
			System.out.println("number is StrongNumber");
		}
		else{
			System.out.println("number is not StrongNumber");
		}
	}
}