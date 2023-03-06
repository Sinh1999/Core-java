package practicals;
/**
 * Practical-10 programs of all the string methods
 * 
 * @author Shailesh Sinh
 * 
 * @since 28-02-2023
 *
 * @version 1.0.1
 */
public class StringMethods {

    public static void main(String[] args) {
        // String variable value declare
        String greeting = "Hello String";
        String greeting2 = "hello String";

        // Return the character at the specified index (position)
        System.out.println("Character at the specified index : " + greeting.charAt(6));

        // Returns the length of a specified string
        System.out.println("length of a specified greeting : " + greeting.length());

        // Appends a string to the end of another string
        System.out.println("Appends a string to the end of another string : " + greeting.concat(greeting2));

        // Returns the unicode of the character at the specified index
        System.out.println("Unicode of the character at the specified index : " + greeting.codePointAt(2));

        // Returns the number of unicode values found in a string.
        System.out.println("Number of Unicode values found in a string : " + greeting.codePointCount(3, 8));

        // Compares two strings lexicographically
        System.out.println("Compares two strings lexicographically : " + greeting.compareTo(greeting2));

        // Return the character at the specified index (position)
        System.out.println("Compares two strings lexicographically, ignoring case differences : " +
            greeting.compareToIgnoreCase(greeting2));

        // Return the character at the specified index (position)
        System.out.println("The hash code of a string : " + greeting.hashCode());

        // Indent is space created
        System.out.println("Indent is space created : " + greeting.indent(10));

        // Returns the position of the first found occurrence of specified characters in a string
        System.out.println("The position of the first found occurrence of specified characters in a string : " +
            greeting.indexOf("Hello"));

        // Returns the position of the last found occurrence of specified characters in a string
        System.out.println("The position of the last found occurrence of specified characters in a string : " +
            greeting.lastIndexOf("String"));

        // Searches a string for a specified value, and returns a new string where the specified values are replaced
        System.out.println("Searches a string for a specified value, and returns a new string where the specified values are replaced : " +
            greeting.replace("S", "h"));

        // Converts a string to lower case letters
        System.out.println("Converts a string to lower case letters : " + greeting.toLowerCase());

        // Converts a string to upper case letters
        System.out.println("Converts a string to upper case letters : " + greeting.toUpperCase());
    }

}