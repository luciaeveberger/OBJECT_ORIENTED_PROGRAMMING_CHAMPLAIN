package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;

public class MyMath {
    // OVERLOADED METHODS => NEED TO BE IN THE SAME CLASS!!
        public static int square(int number){
            return number * number;
        }
        public static int square(int number, int number2){
            return number2 * number;
        }
        public static double square(double number){
            return number * number;
        }

    public static void main(String[] args) {
        System.out.println(MyMath.square(10));
        System.out.println(MyMath.square(10, 8 ));
        System.out.println(MyMath.square(12.0));
    }

}
