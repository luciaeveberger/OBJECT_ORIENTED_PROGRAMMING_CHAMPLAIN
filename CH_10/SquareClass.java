package CH_10;

// our square is more specifc of our shape
public class SquareClass extends Shape{
    // now we also have area
    public double area;

    public SquareClass(int inputWidth, double inputArea){
        // allowing us to use the properties we need
        super(inputWidth);
        this.area = inputArea;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "SquareClass{" +
                "area=" + area +
                '}';
    }
}
