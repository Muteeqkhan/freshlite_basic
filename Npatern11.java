class Npatern11{
	public static void main(String[] args) {
		int row=5;
		int star=1;
		int p=1;
		for(int i=1;i<=row;i++){
			int temp=p;
			for(int j=1;j<=star;j++){
				System.out.print(temp);
				temp--;
			}
			p++;
			star++;
			System.out.println();
		}
	}
	
}