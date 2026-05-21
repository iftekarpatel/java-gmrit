public class strings_demo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("String 1: " + str1); // Output: Hello
        System.out.println("String 2: " + str2); // Output: World

        String str3 = new String("Java");
        System.out.println("String 3: " + str3); // Output: Java

        String str4 = "Hello"; // String literal, may refer to the same object as str1
        str4 = str4.toLowerCase(); // str4 is a new string object with lowercase letters
        System.out.println("String 4: " + str4); // Output: hello

        // // Concatenation
        // String str3 = str1 + " " + str2;
        // System.out.println(str3); // Output: Hello World
        
        // // Length of a string
        // System.out.println("Length of str3: " + str3.length()); // Output: 11
        
        // // Substring
        // String substr = str3.substring(0, 5);
        // System.out.println("Substring: " + substr); // Output: Hello
        
        // // Character at a specific index
        // char ch = str3.charAt(6);
        // System.out.println("Character at index 6: " + ch); // Output: W
        
        // // Convert to uppercase
        // String upperStr = str3.toUpperCase();
        // System.out.println("Uppercase: " + upperStr); // Output: HELLO WORLD
        
        // // Check if a string contains a substring
        // boolean contains = str3.contains("World");
        // System.out.println("Contains 'World': " + contains); // Output: true
    }
    
}
