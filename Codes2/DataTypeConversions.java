public class DataTypeConversions {
    public static void main(String[] args) {
        System.out.println("===== Primitive Data Type Conversions =====");

        // 1. Implicit Conversion (Widening)
        int intValue = 100;
        double doubleValue = intValue;  // int -> double
        System.out.println("int to double: " + doubleValue);

        // 2. Explicit Conversion (Narrowing)
        double doubleNum = 99.99;
        int narrowedInt = (int) doubleNum;  // double -> int (loses decimal part)
        System.out.println("double to int: " + narrowedInt);

        // 3. char to int (ASCII conversion)
        char ch = 'A';
        int asciiValue = ch;  // char -> int
        System.out.println("char to int (ASCII value of A): " + asciiValue);

        // 4. int to char (ASCII reverse conversion)
        char charFromInt = (char) 66;  // int -> char
        System.out.println("int to char (ASCII 66 -> B): " + charFromInt);

        System.out.println("\n===== String to Integer Conversions =====");

        // 1. Using Integer.parseInt()
        String strNum = "1234";
        int intFromString1 = Integer.parseInt(strNum);
        System.out.println("String to int (parseInt): " + intFromString1);

        // 2. Using Integer.valueOf()
        int intFromString2 = Integer.valueOf(strNum);
        System.out.println("String to int (valueOf): " + intFromString2);

        // 3. Using Integer.decode() (for hex, octal, decimal)
        int intFromHex = Integer.decode("0x1A"); // Hexadecimal (26 in decimal)
        int intFromOctal = Integer.decode("012"); // Octal (10 in decimal)
        System.out.println("String to int (decode Hex 0x1A): " + intFromHex);
        System.out.println("String to int (decode Octal 012): " + intFromOctal);

        System.out.println("\n===== Integer to String Conversions =====");

        // 1. Using String.valueOf()
        String strFromInt1 = String.valueOf(intValue);
        System.out.println("int to String (valueOf): " + strFromInt1);

        // 2. Using Integer.toString()
        String strFromInt2 = Integer.toString(intValue);
        System.out.println("int to String (toString): " + strFromInt2);

        // 3. Using String.format()
        String strFromInt3 = String.format("%d", intValue);
        System.out.println("int to String (String.format): " + strFromInt3);

        // 4. Using Concatenation
        String strFromInt4 = intValue + "";
        System.out.println("int to String (Concatenation): " + strFromInt4);

        System.out.println("\n===== Other Type Conversions =====");

        // double to String
        String doubleToStr = Double.toString(doubleNum);
        System.out.println("double to String: " + doubleToStr);

        // String to double
        double strToDouble = Double.parseDouble("45.67");
        System.out.println("String to double: " + strToDouble);

        // String to boolean
        boolean boolValue = Boolean.parseBoolean("true");
        System.out.println("String to boolean: " + boolValue);

        // boolean to String
        String boolToStr = Boolean.toString(true);
        System.out.println("boolean to String: " + boolToStr);

        // int to float
        float intToFloat = intValue;
        System.out.println("int to float: " + intToFloat);

        // float to int
        int floatToInt = (int) 23.78f;
        System.out.println("float to int: " + floatToInt);

        // long to int (Explicit Cast)
        long longNum = 123456789L;
        int longToInt = (int) longNum;
        System.out.println("long to int: " + longToInt);

        // int to long (Implicit Conversion)
        long intToLong = intValue;
        System.out.println("int to long: " + intToLong);
    }
}
