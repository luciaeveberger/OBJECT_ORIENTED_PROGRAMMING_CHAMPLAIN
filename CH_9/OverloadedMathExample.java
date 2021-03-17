package CH_9;

public class OverloadedMathExample {
    public static int square(int number){
        return number * number;
    }
    public static double square(double number){
        return number * number;
    }

    public static void main(String[] args) {
        // which 10.5 or 11 -> this gives us a bit more flexibility to do what we need to do to !
        OverloadedMathExample.square(10);
        OverloadedMathExample.square(10.0);

    }



}
