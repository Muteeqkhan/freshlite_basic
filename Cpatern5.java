class Cpatern5{
	public static void main(String[] args) {
		int row=6;
		int space=5;
		int star=1;
		char p='F';
		for(int i=1;i<=row;i++){
			char temp=p;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print((char)temp+" ");
				temp++;
			}
			System.out.println();
			p--;
			space--;
			star++;
		}
	}
	
}