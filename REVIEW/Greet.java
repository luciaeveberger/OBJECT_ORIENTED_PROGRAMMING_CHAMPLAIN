package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;

public class Greet{
    /*

    These overloaded methods give us flexibility!!
    They allow us to pass different parameter lists -> Student or many students
    just gives us some flexibility as the developer!

     */
    public static String greet(String person){
        return "Hello " + person;

    }
    public static String greet(String person1, String person2){
        return "Hello " + person1 + " " + person2;
    }

    public static void main(String[] args) {
        System.out.println(Greet.greet("Jacob"));
        System.out.println(Greet.greet("Tiago", "Elessia"));
    }


}
