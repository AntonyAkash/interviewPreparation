package String;

import java.util.Arrays;

public class dublicateinStringinjava {
	//find dublicate with out using collections and map
	public static void main(String[] args) {
		String a="Antony".toLowerCase();
		char[] count=new char[256];
		for(int i=0;i<a.length();i++) {
			count[a.charAt(i)]++;
		}
		for(int i=0;i<count.length;i++) {
			int c=0;
			if(count[i]!=0) {
				System.out.println((char) i+":"+(int)count[i]);
			}
		}
	}

}
