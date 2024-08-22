/*

Multiple Classes in Same File: Multiple classes can be defined within the same source file if needed for encapsulation purposes

 */

public class MultipleClassesInSameFile {
    public static void main (String[] args){
        System.out.println(GenerateMessage.generateMessage());
        System.out.println(AnotherMessage.generateAnotherMessage());

    }
}

class GenerateMessage{
    static String generateMessage(){
        return "Here is one Message";
    }
}

class AnotherMessage{
    static String generateAnotherMessage(){
        return "Here is another message";
    }
}