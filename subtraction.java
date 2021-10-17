class subtraction{
	public static void main(String[] args) {
		int a=15;
		int b=-5;
		if(b>0){
			while(b>0){
				a--;
				b--;
			}
		}
		if(b<0){
			while(b<0)
			{
				a++;
				b++;
			}
		}
		System.out.println("sub:" +a);
	}
	
}