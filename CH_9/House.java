package CH_9;

public class House {
    // default constructor already -> java is our friend in this regard

    public boolean isSold;

    public House(boolean demoIssold){
        this.isSold = demoIssold;
    }
    public House(){
        this.isSold = true;
    }

    public static void main(String[] args) {
        House h = new House(false);
        House demoHouse = new House();
        // no args contructor here !
        House newHouse = new House();

    }
}
