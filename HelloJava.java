//Executing First Single-File Source-Code Program
//To execute a single-file source-code program, the first class defined in the source file must contain public static void main(String[])
//Passing in an argument can be done like this: java HelloJava.java World!


public class HelloJava {
    public static void main (String [] args){
        System.out.println("Hello"+ args[0]);
    }
}