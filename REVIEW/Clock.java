package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;

/**
 *  This program demonstrates a clock
 */


public class Clock {
    /*
    Example of a clock !
     */
    // instance variables
    //clock object would have second, minute, and hour data attributes
    public double second;
    public double minute;
    public double hour;

    // constructor -> setups {special method -> setups our class}
    public Clock(double inputSeconds, double inputMinutes, double inputHours){
        // this constructor => setups it up
        this.second = inputSeconds;
        this.minute = inputMinutes;
        this.hour = inputHours;

    }
    // access + modify some values

    public double getSecond() {
        return second;
    }

    public double getHour() {
        return hour;
    }

    public double getMinute() {
        return minute;
    }

    // methods => ect

    public void setHour(double hour) {
        this.hour = hour;
    }
}
