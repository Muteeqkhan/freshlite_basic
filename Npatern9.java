class Npatern9{
	public static void main(String[] args) {
		int row=5;
		int star=5;
		for (int i=1;i<=row;i++){
			int p=1;
			for(int j=1;j<=star;j++){
				System.out.print(p);
				p++;
			}
			System.out.println();
			star--;
		}
	}
	
}