class Npatern15{
	public static void main(String[] args) {
		int row=5;
		int space=0;
		int star=5;
		for(int i=1;i<=row;i++){
			int p=1;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print(p+" ");
				p++;
			}
			space++;
			star--;
			System.out.println();
		}
	}
	
}