class Npatern6{
	public static void main(String[] args) {
		int row=5;
		int space=4;
		int star=1;
		for (int i=1;i<=row;i++){
			int p=1;
			for(int k=1;k<=space;k++){
				System.out.print(" ");
			}
			for (int j=1;j<=star;j++){
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
			space--;
			star++;
		}
	}
}