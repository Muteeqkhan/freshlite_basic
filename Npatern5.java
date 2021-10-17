class Npatern5{
	public static void main(String[] args) {
		int row=10;
		int star=5;
		int p=5;
		for(int i=1;i<=row;i++){
			
			int temp=p;
			for (int j=1;j<=star;j++){
				System.out.print(temp);
				temp--;;

			}
			
			System.out.println();

			if (i<row/2){
				p--;

				star--;
			}
			else{
				p++;
				star++;
			}
		}
	}
	
}