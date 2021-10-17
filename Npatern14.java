class Npatern14{
	public static void main(String[] args) {
			int row=5;
			int star=1;
			for(int i=1;i<=row;i++){
				int p=1;
				for(int j=1;j<=star;j++){
					System.out.print(p+" ");
					if (j>=i){
						p--;
					}
					else{
						p++;
					}
				}
				System.out.println();
				star+=2;
			}
		}	
}