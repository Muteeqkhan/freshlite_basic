class Sum{
	public static void main(String[] args) {
		int a=-45;
		int b=-44;
		if(b>0){
			while(b>0){
			a++;
			b--;
			}
		}
		if(b<0){
			while(b<0){
				a--;
				b++;
			}
		}

		System.out.println("the sum of number is :"+a);
	}
}