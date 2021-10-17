class Palindrome{
	public static void main(String[] args) {
		int num=141;
		int pali=0;
		int rem;
		int num2=num;
		while(num>0){
			rem=num%10;
			pali=rem+(pali*10);
			num=num/10;
		}
		if(num2==pali){
			System.out.println("given number is Palindrome");
		}
		else{
			System.out.println("number is not Palindrome");
		}
	}
	
}