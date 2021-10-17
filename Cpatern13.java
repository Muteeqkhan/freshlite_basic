class Cpatern13{
	public static void main(String[] args) {
		int row=5;
		int star=5;
		char p='A';
		for(int i=1;i<=row;i++){
			char temp=p;
			for(int j=1;j<=star;j++){
				System.out.print((char)temp);
				temp++;
			}
			System.out.println();
			p++;
		}
	}
	
}