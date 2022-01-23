package regexPatternMatchImplementation;

import java.util.regex.*;

public class RegexPatternMatchImplementation {

	public static void main(String[] args) {

		// Three way for the Pattern.matches in Java
		
		Pattern pattern = Pattern.compile(".s..o..m.");
		Matcher matcher = pattern.matcher("astronomy");  
		boolean result1 = matcher.matches();  
		  
		boolean result2 =Pattern.compile(".s..o..m.").matcher("astronomy").matches();  
		  
		boolean result3 = Pattern.matches(".s..o..m.", "astronomy");  
		  
		System.out.println(result1 + " " + result2 + " " + result3);  
		
	}

}
