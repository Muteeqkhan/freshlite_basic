class Pattern9{
	public static void main(String[] args) {
		int row=5;
		int space=2;
		int star=1;
		int sspace=1;
		int sstar=2;
		for(int i=1;i<=row;i++){
			for (int j=1;j<=space ;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			if (i<=row/2){
				star++;
				space--;
			}
			else{
				star--;
				space++;
			}
			System.out.println();
		}
	}
	
}