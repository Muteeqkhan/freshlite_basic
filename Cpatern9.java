class Cpatern9{
	public static void main(String[] args) {
		int row=6;
		int space=5;
		int star=1;
		char p='A';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print((char)p+" ");
			}
			p++;
			System.out.println();
			star++;
			space--;
		}
	}
	
}