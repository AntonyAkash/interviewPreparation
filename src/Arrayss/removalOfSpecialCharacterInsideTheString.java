package Arrayss;

public class removalOfSpecialCharacterInsideTheString {
	public static void main(String[] args) {
		String s="!@#$%^^&&*&@*@**(Vine123$%^&*(";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
