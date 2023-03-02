package practicals;

public class Practical10 {

	public static void main(String[] args) {
		
	/*
	 * String variable value declare
	 */
		
	String string = "Hello String";
	
	String string2 = "hello String";
	
	/*
	 * Return Return the character at the specified index (position)
	 */
	
	System.out.println("Character at the specified index : " + string.charAt(6));
	
	/*
	 * Returns the length of a specified string
	 */
	
	System.out.println("length of a specified string : " + string.length());
	
	/*
	 * Appends a string to the end of another string
	 */
	
	System.out.println("Appends a string to the end of another string : " +string.concat(string2));
	
	/*
	 * Returns the Unicode of the character at the specified index
	 */
	
	System.out.println("Unicode of the character at the specified index : " + string.codePointAt(2));
	
	/*
	 * Returns the number of Unicode values found in a string.
	 */
	
	System.out.println("Number of Unicode values found in a string : " + string.codePointCount(3, 8));
	
	/*
	 * Compares two strings lexicographically
	 */
	
	System.out.println("Compares two strings lexicographically : " + string.compareTo(string2));
	
	/*
	 * Return Return the character at the specified index (position)
	 */
	
	System.out.println("Compares two strings lexicographically, ignoring case differences : " + string.compareToIgnoreCase(string2));
	
	/*
	 * Return Return the character at the specified index (position)
	 */
	
	System.out.println("The hash code of a string : " + string.hashCode());
	
	/*
	 * Indent is space created 
	 */
	
	System.out.println("Indent is space created : " + string.indent(10));
	
	/*
	 * Returns the position of the first found occurrence of specified characters in a string
	 */
	
	System.out.println("The position of the first found occurrence of specified characters in a string : " + string.indexOf("Hello"));
	
	/*
	 * Returns the position of the last found occurrence of specified characters in a string
	 */
	
	System.out.println("The position of the last found occurrence of specified characters in a string : " + string.lastIndexOf("String"));
	
	/*
	 * Searches a string for a specified value, and returns a new string where the specified values are replaced
	 */
	
	System.out.println("Searches a string for a specified value, and returns a new string where the specified values are replaced : " + string.replace("S", "h"));
	
	/*
	 * Converts a string to lower case letters
	 */
	
	System.out.println("Converts a string to lower case letters : " + string.toLowerCase());
	
	/*
	 * Converts a string to upper case letters
	 */
	
	System.out.println("Converts a string to upper case letters : " + string.toUpperCase());
	
	}
	
}
