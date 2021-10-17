class Npatern22{
	public static void main(String[] args) {
		int row=7;
		int star=1;
		int p;
		for(int i=1;i<=row;i++){
			p=1;
			for(int j=1;j<=star;j++){
				if(j%2==0){
					p=0;
				}
				else{
					p=1;
				}
				System.out.print(p);
			}
			System.out.println();
			star++;
		}
	}
	
}