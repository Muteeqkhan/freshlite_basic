class Cpatern7{
	public static void main(String[] args) {
		int  row=6;
		int star=6;
		int  p=65;
		for(int i=1;i<=row;i++){
			char temp=(char)p;
			for(int j=1;j<=star;j++){
				System.out.print((char)p);
				if(star-j==i){
					p=p+i-1;
				}

			}
			System.out.println();
		}
	}
}