class Npatern28{
	public static void main(String[] args) {
		int row=13;
		int star=1;
		int p;
		for(int i=1;i<=row;i++){
			p=1;
			for(int j=1;j<=star;j++){
				System.out.print(p);
				p++;
			}
			if(i<=row/2){
				star++;
			}
			else{
				star--;
			}
			System.out.println();
		}
	}
	
}