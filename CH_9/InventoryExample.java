package CH_9;

public class InventoryExample {

    // second box => this. keyword indicates its the instance variable i am referreing to, NOT another type of input!
    private String description;
    private int units;


    public InventoryExample(){
        this.description = "";
        this.units = 0;

    }
    public InventoryExample(String description){
        this.description = description;
        this.units =0;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getUnits() {
        return units;
    }

    public String getDescription() {
        return description;
    }
}
