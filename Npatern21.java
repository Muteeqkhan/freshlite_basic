class Npatern21{
	public static void main(String[] args) {
		int row=7;
		int star=7;
		int p;
		for(int i=1;i<=row;i++){
			p=0;
			
			for(int j=1;j<=star;j++){
				if(j==i){
					p=p+i-1;
				}
				else{
					p=0;
				}
				System.out.print(p);
			}
			System.out.println();

		}
	}
	
}