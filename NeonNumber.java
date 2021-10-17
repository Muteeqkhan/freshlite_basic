class NeonNumber{
	public static void main(String[] args) {
		int num=1;
		int sqr=num*num;
		int temp=sqr;
		int sum=0;
		int rem;
		while(temp>0){
			rem=temp%10;
			sum=sum+rem;
			temp/=10;
		}
		if(sum==num){
			System.out.println("is NeonNumber");
		}
		else{
			System.out.println("not NeonNumber");
		}

	}
}