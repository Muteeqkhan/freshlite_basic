class Npatern23{
	public static void main(String[] args) {
		int row=7;
		int star=7;
		int p=0;
		int p1=0;;
		for(int i=1;i<=row;i++){
			if(i%2==0){
				p=0;
			}
			else{
				p1=1;
			}
			for(int j=1;j<=star;j++){
				if(j%2==0){
					System.out.print(p);
				}
				else{
					System.out.print(p1);
				}

			}
			System.out.println();
		}
	}
	
}