class DecOddStar{
	public static void main(String[] args) {
		int row=3;
		int star=5;
		int space=0;
		for (int i=1;i<=row;i++){
			for (int k=1;k<=space;k++){
				System.out.print(" ");
			}

			for (int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			star-=2;
			space++;
		}
	}
	
}