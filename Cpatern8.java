class Cpatern8{
	public static void main(String[] args) {
		int star=11;
		int row=6;
		char temp='A';
		for(int i=1;i<=row;i++){
			char p=temp;
			for(int j=1;j<=star;j++){
				System.out.print((char)p);
				if(j<=star/2){
					p++;
				}
				else{
					p--;
				}
				
			}
			System.out.println();
			star-=2;
			temp++;
		}
	}
	
}