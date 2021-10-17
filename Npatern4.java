class Npatern4{
	public static void main(String[] args) {
		int row=10;
		int star=5;
		for(int i=1;i<=row;i++){
			int p=1;
			for(int j=1;j<=star;j++){
				System.out.print(p);
				p++;
			}

			if (i<row/2){
				star--;
			}
			else
			{
				star++;
			}

		System.out.println();

		}
			
	}
	
}