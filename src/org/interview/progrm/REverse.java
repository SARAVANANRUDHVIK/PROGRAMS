package org.interview.progrm;

public class REverse {

	public static void main(String[] args) {
		String s = " Greens";
		String rev ="";

		for (int i=s.length()-3; i>=0;i--){
		char C= s.charAt(i);
		rev=rev+C;
		System.out.println(rev);

	}}

}
