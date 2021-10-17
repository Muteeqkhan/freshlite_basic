class PerfectNumber{
	public static void main(String[] args) {
		int num=29;
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum=sum+i;
			}
		}
		if(num==sum){
			System.out.println("is a PerfectNumber");
		}
		else{
			System.out.println("not a PerfectNumber");
		}
	}
	
}