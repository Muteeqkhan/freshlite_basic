class Npatern19{
	public static void main(String[] args) {
		int row=5;
		int star=1;
		int x,y;
		for(int i=1;i<=row;i++){
			if (i%2==0){
				x=0;
				y=1;
			}
			else{
				x=1;
				y=0;
			}
			for(int j=1;j<=star;j++){
				if(j%2==0){
					System.out.print(y);
				}
				else{
					System.out.print(x);
				}
			}
			System.out.println();
			star++;
		}
	}
	
}