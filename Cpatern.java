class Cpatern{
	public static void main(String[] args) {
		int row=6;
		int  space=0;
		int star=6;
		for(int i=1;i<=row;i++){
			char p= 'A';
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print((char)p+" ");
				p++;
			}
			System.out.println();
			star--;
			space++;
		}
	}
	
}