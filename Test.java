// 1. Compile with command javac NameOfFile.java
// 2. Correct any compilation time syntax errors
// 3. Run program (.class) file generated by compiling using the command
// java NameOfFile.
// 4. the Test.class file contains the bytecode file that the JVM will
// translate to machine code. 

// File names must be the same as Class names.
// EACH file IS a class.
// Below is written in PASCAL Case.
public class Test {
    // Public static void is like func in Python - main is the method name - this is the 
    // method signature.
    // The file or class with the exact method signature below is always the launch point of 
    // the app - you cannot run without it.
    public static void main(String[] args) {
        // All procedural code goes here within the main method (for now).
        System.out.println("Hello World!");
    }
}
