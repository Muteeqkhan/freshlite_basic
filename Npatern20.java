class Npatern20{
	public static void main(String[] args) {
		int row=7;
		int star=7;
		int p;
		for(int i=1;i<=row;i++){
			if (i==7) {
				p=7;
			}
			else {
				p=1;
			}
			for (int j=1;j<=star;j++){
				System.out.print(p);
				if(star-j==i){
					
					p=(p+i-1);
					
				}
			}
			System.out.println();


		}
	}
	
}