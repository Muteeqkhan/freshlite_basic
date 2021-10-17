class Npatern2{
	public static void main(String[] args) {
		int row=5;
		int star=1;
		int p=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=star;j++){
				System.out.print(p);
			}
			star++;
			System.out.println();
			p++;
		}
	}
	
}