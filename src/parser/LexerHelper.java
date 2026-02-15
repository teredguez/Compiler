package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str){
		try{
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str){
		// simple char
		if (str.length() == 3) {
			return str.charAt(1);
		}

		// special chars
		if (str.equals("'\\n'"))
			return '\n';

		if (str.equals("'\\t'"))
			return '\t';

		// ASCII
		try {
			return (char) Integer.parseInt(str.substring(2, str.length() - 1));
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid character literal: " + str);
		}
	}
	
}
