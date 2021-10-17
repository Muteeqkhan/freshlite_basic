class Cpatern14{
	public static void main(String[] args) {
		int row=5;
		int star=9;
		char p='A';
		for(int i=1;i<=row;i++){
			char temp=p;
			for(int j=1;j<=star;j++){
				System.out.print((char)temp);
				if(j<=star/2){
					temp++;
				}
				else{
					temp--;
				}
				
			}
			System.out.println();
			star-=2;
		}
	}
	
}