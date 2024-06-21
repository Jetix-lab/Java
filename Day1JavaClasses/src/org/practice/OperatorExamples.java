package org.practice;

public class OperatorExamples {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println();
        
        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
        System.out.println();
        
        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT
        System.out.println();
        
        // Bitwise Operators
        int num1 = 5, num2 = 3;
        System.out.println("Bitwise Operators:");
        System.out.println("num1 & num2: " + (num1 & num2));   // Bitwise AND
        System.out.println("num1 | num2: " + (num1 | num2));   // Bitwise OR
        System.out.println("num1 ^ num2: " + (num1 ^ num2));   // Bitwise XOR
        System.out.println("~num1: " + (~num1));               // Bitwise Complement
        System.out.println("num1 << 1: " + (num1 << 1));       // Left Shift
        System.out.println("num1 >> 1: " + (num1 >> 1));       // Right Shift
        System.out.println();
        
        // Assignment Operators
        int c = 10;
        System.out.println("Assignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);
        System.out.println();
        
        // Unary Operators
        int d = 5;
        System.out.println("Unary Operators:");
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("--d: " + (--d)); // Pre-decrement
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println();
        
        // Conditional (Ternary) Operator
        int score = 75;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("Conditional Operator:");
        System.out.println("Result: " + result);
    }
}
