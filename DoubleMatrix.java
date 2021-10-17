class DoubleMatrix{
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int row=4;
		int star =2;
		int space=1;
		for (int i=1;i<=row;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
				if(i==j){
					System.out.print(" ");
				}

			}
			System.out.println();
			star+=2;
		}
	}
}	