package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;

public class Temperature {

    public double temperature;
    // when we don't explictly define our static variable => it will default!
    public static double maxTemp;


    public static void main(String[] args) {

        Temperature t1  = new Temperature();
        System.out.println(t1.maxTemp);




    }

}
