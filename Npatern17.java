class Npatern17{
	public static void main(String[] args) {
		int row=7;
		int num=1;
		int star=6;
		for(int i=1;i<=row;i++){
			int p=1;
			for(int j=1;j<=num;j++){
				System.out.print(p);
				p++;
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");

			}
			star--;
			num++;
			System.out.println();
		}	
	}
	
}