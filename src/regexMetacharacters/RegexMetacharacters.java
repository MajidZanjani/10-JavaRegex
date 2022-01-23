package regexMetacharacters;

import java.util.regex.Pattern;

public class RegexMetacharacters {

	public static void main(String[] args) {
		System.out.println("Metacharacter Digit:");
		System.out.println(Pattern.matches("\\d", "4"));
		System.out.println(Pattern.matches("\\d", "a4"));
		System.out.println(Pattern.matches("\\d", "34"));
		
		System.out.println("Metacharacter non-Digit:");
		System.out.println(Pattern.matches("\\D", "f"));
		System.out.println(Pattern.matches("\\D", "a4"));
		System.out.println(Pattern.matches("\\D", "sd"));
		
		System.out.println("Metacharacter Word Boundary:");
		System.out.println(Pattern.matches("\\w", "d"));
		System.out.println(Pattern.matches("\\w", "3"));
		
		System.out.println("Metacharacter non-Word Boundary:");
		System.out.println(Pattern.matches("\\W", "#"));
		
		System.out.println("Metacharacter whitespace Boundary:");
		System.out.println(Pattern.matches("\\s", " "));			
		
		System.out.println("Metacharacter Principal of Boundary:");
		if (Pattern.matches("[a-zA-Z0-9]*\\@[a-zA-Z0-9]*\\.[a-zA-Z]*", "myname34@email.com")) {
			System.out.println("Correct email format.");
		} else {
			System.out.println("Email format is not acceptable.");
		}
		
	}

}
