package String;

public class coutnnumberofwordsinAstring {
	public static void main(String[] args) {
		String name=" Hello   world Antony Immanuel ".trim();
		int count=1;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==' '&&name.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
