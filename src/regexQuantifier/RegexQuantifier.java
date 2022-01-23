package regexQuantifier;

import java.util.regex.Pattern;

public class RegexQuantifier {

	public static void main(String[] args) {
		
		System.out.println("? Quantifier:");
		System.out.println(Pattern.matches("[abcd]?", "c"));
		System.out.println(Pattern.matches("[abcd]?", "cc"));
		System.out.println(Pattern.matches("[abcd]?", "bc"));
		
		System.out.println("\n+ Quantifier:");
		System.out.println(Pattern.matches("[abcd]+", "c"));
		System.out.println(Pattern.matches("[abcd]+", "cc"));
		System.out.println(Pattern.matches("[abcd]+", "bc"));	

		System.out.println("\n* Quantifier:");
		System.out.println(Pattern.matches("[abcd]*", "c"));
		System.out.println(Pattern.matches("[abcd]*", "cc"));
		System.out.println(Pattern.matches("[abcd]*", "abc"));	
		
	}

}
