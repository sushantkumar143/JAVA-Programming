public class Conversions {
    public static void main(String[] args) {
        
        // IMPLICIT TYPE CONVERSION (WIDENING CONVERSION)
        // Converts data type automatically.
        // No loss of data.

        // EXPLICIT TYPE CONVERSION
        // Data loss may happen.
        // Requires manual casting.
        // Done by the programmer using the (cast) operator.
        // Converts larger data type to smaller data type.
        
        String a = "132";
        // Convert String to int
        int num = Integer.parseInt(a);  // Correctly convert the String to int
        System.out.println("num = " + num);  // Print the converted integer
    }
}
