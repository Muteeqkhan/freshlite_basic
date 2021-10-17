class Patern1{
	public static void main(String[] args) {
		int row=5;
		int star=1;
		int sstar=2;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			if (i<=row/2){
				star++;
			}
			else
				star--;

		}	
		
	}
}