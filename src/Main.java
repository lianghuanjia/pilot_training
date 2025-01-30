
/*
1. What is Java variables and How to declare Java variables?
    A variable is a named container used to store data
    Declare type and name of variables
2. What are Java data types?
    2 types of Java data types:
        Primitive Data types
        reference data types
3. What are Primitive data types in Java?
    byte, short, long, int, boolean, float, double, char
4. What is wrapper class in Java and Why we need wrapper class?
    Wrapper class is an object representation of a primitive type
    They convert primitive data type to reference data type. Some data structure only support reference data type,
    so data structure can use wrapper class to use primitive data type
5. What is the diﬀerences between passing by value and passing be reference?

6. What is an Immutable class in Java?
    Immutable class can't be modified after creation
7. How to create a custom immutable class in Java?
    - The class is final
    - All fields are final and private
    - No setters

8. What is String pool in Java and why we need String pool?
    - String pool is a special memory area in the Heap where string literals are stored in side.
    - We use it to optimize memory usage, to reuse Strings if a String is created before

9. What are the results of following expressions? Please include the calculation process.
- 5 & 6: Bitwise AND. 4
- 5 | 6: Bitwise OR. 7
- 5 ^ 6: Bitwise XOR. 3

10. Why we need to use break statement in Switch statement?
    - Prevent executing all cases. To make sure only the matched case executes and then exits

11. What are access modifiers and their corresponding scopes in Java?
    - public: everywhere
    - private: within the package's subclass
    - protected: within the package
    - (default): within the class

12. What is static field and static method?
    - static field belongs to the class, not an instance
    - static method can be called without creating an object

13. Explain the main method in Java.
    - It's the entry point of our program
    - public:	JVM can access it from anywhere
    - static:	Runs without creating an object
    - void:	    Doesn't return a value
    - String[] args:	Command-line arguments
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // q1
        MathCalculator mathCalculator = new MathCalculator();
        int[] input1 = {5, 6, 14, 7};
        String[] input2 = {"Add", "Sub", "Div"};
        int result = mathCalculator.evaluateExpression(input1, input2);
        System.out.println("Result: " + result);

        // q2
        MinuteConvertor minuteConvertor = new MinuteConvertor();
        minuteConvertor.convert(3456789);

        // q3
        SquaresAndCubes squaresAndCubes = new SquaresAndCubes();
        squaresAndCubes.print();

        // q4:
        // Run Power class

        // q5:
        // Run LargestNumberCounter class

        // q6:
        int[] nums = {2, 2, 1}; // Example input
        System.out.println("Single Number: " + SingleNumber.findSingleNumber(nums)); // Expected Output: 1

        // q7:
        NumberInWord numberInWord = new NumberInWord();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Using Nested-If: " + numberInWord.printUsingNestedIf(number));

        System.out.println("Using Switch-Case: " + numberInWord. printUsingSwitchCase(number));

        scanner.close();


        // q8:
        CustomIntegerWrapper num1 = new CustomIntegerWrapper(100);
        CustomIntegerWrapper num2 = new CustomIntegerWrapper(200);
        CustomIntegerWrapper num3 = new CustomIntegerWrapper(100);

        System.out.println("num1 intValue(): " + num1.intValue());
        System.out.println("num1 longValue(): " + num1.longValue());
        System.out.println("num1 floatValue(): " + num1.floatValue());
        System.out.println("num1 doubleValue(): " + num1.doubleValue());

        System.out.println("num1 equals num2? " + num1.equals(num2));
        System.out.println("num1 equals num3? " + num1.equals(num3));

        System.out.println("num1 compareTo num2: " + num1.compareTo(num2)); // -1
        System.out.println("num2 compareTo num1: " + num2.compareTo(num1)); // 1
        System.out.println("num1 compareTo num3: " + num1.compareTo(num3)); // 0

        System.out.println("num1 toString(): " + num1);
    }
}