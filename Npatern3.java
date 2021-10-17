class Npatern3{
	public static void main(String[] args) {
		int row=9;
		int star=1;
		for(int i=1;i<=row;i++){
			int p=1;
			for (int j=1;j<=star;j++){
				System.out.print(p);
				p++;
			}
			System.out.println();
			if(i<=row/2){
				star++;
			}
			else{
				star--;
			}
		}
	}
	
}