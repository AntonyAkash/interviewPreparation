package String;

public class ComapringTwoString {
	public static void main(String[] args) {
		String s="Antony";
		String c="antony";
		//System.out.println(s.equals(c));
		//System.out.println(s.equalsIgnoreCase(c));
		//System.out.println(s.compareTo(c));  //return +ve or Negative integer in the value are not equal when comapred lexographiocally;
		System.out.print(s.compareToIgnoreCase(c)); //if equals return true 
				
	}

}
