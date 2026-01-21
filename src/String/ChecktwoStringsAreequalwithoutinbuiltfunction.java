package String;

public class ChecktwoStringsAreequalwithoutinbuiltfunction {
	public static void main(String[] args) {
		String s1="Antony";
		String s2="Antony";
		boolean isequal =false;
		for(int i=0;i<s1.length();i++) {
			 if(s1.charAt(i)!=s2.charAt(i)) {
				 isequal=false;
				 break;
			 }
			 isequal=true;
			}
		System.out.println(isequal);
		}

}
