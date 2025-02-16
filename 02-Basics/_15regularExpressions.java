public class _15regularExpressions {
    public static void main(String[] args) {
        String str = "D";       // Single character string
        String str1 = "8";      // Single digit string
        String str2 = "$";      // Single special character string
        String str3 = "rahul";  // Multi-character string
        String str4 = "abcde123f"; // Alphanumeric string
        String str5 = "aabbccaa";  // Repeated sequence of 'a', 'b', 'c' and 'a'
        
        // Matches any single character (since "." matches any character)
        System.out.println(str.matches("."));  // true
        System.out.println(str1.matches(".")); // true
        System.out.println(str2.matches(".")); // true
        System.out.println(str3.matches(".")); // false (str3 has more than one character)
        
        // Matches if 'str' is 'A', 'D', or 'C' (character set)
        System.out.println(str.matches("[ADC]")); // true (str is "D")
        
        // Matches if 'str' is NOT 'A', 'D', or 'C' (negated character set)
        System.out.println(str.matches("[^ADC]")); // false (str is "D", which is in the set)
        
        // Matches if 'str' is an alphanumeric character (letters or digits)
        System.out.println(str.matches("[a-zA-Z0-9]")); // true ("D" is an uppercase letter)
        
        // Matches if 'str' is a lowercase letter followed by a digit from 1-8
        System.out.println(str.matches("[a-z][1-8]")); // false (str is a single character "D")
        
        // Matches if 'str' is either "A" or "D" (alternation)
        System.out.println(str.matches("A|D")); // true (str is "D")
        
        // Matches if str3 is exactly "rahul" (exact match)
        System.out.println(str3.matches("rahul")); // true (str3 is "rahul")
        
        // Meta characters (predefined character classes)
        // \w matches any word character (letter, digit, underscore)
        System.out.println(str.matches("\\w")); // true (str is a letter "D")
        
        // \W matches any non-word character
        System.out.println(str.matches("\\W")); // false ("D" is a word character)
        
        // \d matches a digit (0-9)
        System.out.println(str.matches("\\d")); // false ("D" is not a digit)
        
        // \D matches a non-digit character
        System.out.println(str.matches("\\D")); // true ("D" is not a digit)
        
        // \s matches a whitespace character
        System.out.println(str.matches("\\s")); // false ("D" is not a space)
        
        // \S matches a non-whitespace character
        System.out.println(str.matches("\\S")); // true ("D" is not a space)
        
        // Quantifiers (used to specify the number of occurrences)
        // .* matches zero or more characters (any character repeated any number of times)
        System.out.println(str4.matches(".*")); // true (str4 is "abcde123f")
        
        // [a-z]* matches zero or more lowercase letters
        System.out.println(str4.matches("[a-z]*")); // false (str4 contains digits)
        
        // [abc]* matches zero or more occurrences of 'a', 'b', or 'c'
        System.out.println(str5.matches("[abc]*")); // true (str5 is "aabbccaa")
        
        // [abc]+ matches one or more occurrences of 'a', 'b', or 'c'
        System.out.println(str5.matches("[abc]+")); // true (str5 is "aabbccaa")
        
        // [abc]{4} matches exactly 4 occurrences of 'a', 'b', or 'c'
        System.out.println(str5.matches("[abc]{4}")); // false (str5 has 8 characters)
        
        // [abc]{4,8} matches between 4 and 8 occurrences of 'a', 'b', or 'c'
        System.out.println(str5.matches("[abc]{4,8}")); // true (str5 has exactly 8 characters)
        
        // [abc]? matches zero or one occurrence of 'a', 'b', or 'c'
        System.out.println(str5.matches("[abc]?")); // false (str5 has more than one character)
    }
}
