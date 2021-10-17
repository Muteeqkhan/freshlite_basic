import java.lang.*;
class Charrepeat{
	public static void main(String[] args) {
		String s="my name is kahn";
		char s1[]=s.toCharArray();
		int count;
		for(int i=0;i<s.length();i++) {
			count=1;
			for(int j=1+i;j<s.length();j++) {
				if(s1[i]==s1[j] && s1[i]!=' ') {
					count++;
					
				}
			}
			if(count>1) {
				System.out.println(s1[i]);
				
			}
		}
	}
	
}