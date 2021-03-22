package CH_10;

public class Shape {
    // we the data the represents this shape
    private int width;

    public Shape(){
        this.width=0;
    }
    // these constructors allow us to set up our class!
    public Shape(int inputWidth){
        this.width = inputWidth;
    }

    // get =-> allow us to manipulate our data!
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
