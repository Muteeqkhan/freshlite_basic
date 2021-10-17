class SwapNumber{
	public static void main(String[] args) {
		int a=15;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("numbers after swap: a="+a+"\t b:="+b);
	}
	
}