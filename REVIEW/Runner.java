package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;

public class Runner {
    public static void main(String[] args) {
        // define a Clock here
        double secondValue = 10;
        // some validation =>
        Clock grandfatherClock = new Clock(10.0, 20.0, 30);

        System.out.println("this is the hour " + grandfatherClock.getHour());
        System.out.println("this is the second " + grandfatherClock.getSecond());

        double updatedHour = 4.0;
        grandfatherClock.setHour(updatedHour);
        System.out.println("this is the hour " + grandfatherClock.getHour());


    }
}
