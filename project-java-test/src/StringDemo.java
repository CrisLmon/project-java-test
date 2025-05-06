public class StringDemo {
    public static void main(String[] args){
        String greeting = "Hello";
        String name = "Alice";
        String message = greeting + ", " + name + "!";

        System.out.println(message);
        System.out.println("The lenght of the message is: " + message.length());
        System.out.println("The firts character is: " + message.charAt(0));
        System.out.println("Uppercase message: " + message.toUpperCase());
        System.out.println("First five characters: " + message.substring(0, 5));
    }
}
