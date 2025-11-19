package String;

public class AnagramIncoreJava {
	public static void main(String[] args) {
		String a="abbc";
		String b="abcb";
		boolean c=a.length()==b.length()?checkAnagaram(a,b):false;
		System.out.println(c);
	}
	
	public static boolean checkAnagaram(String a, String b) {
		char[] count=new char[256];
		for(int i=0;i<a.length();i++) {
		    count[a.charAt(i)]++;
		    count[b.charAt(i)]--;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				System.out.println("not an anagarm");
				return false;
			}
		}
		return true;
	}

}
