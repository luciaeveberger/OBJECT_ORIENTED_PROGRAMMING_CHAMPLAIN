package CH_9;

/**
 * This class holds data about a cube.
 */

public class Cube extends Rectangle {
    // so in addition to the length and the width + height as well
    private double height;  // The height of the cube

    /**
     * The constructor accepts the cube's length,
     * width, and height as arguments.
     */

    public Cube(double len, double w, double h) {
        // from our rectagle + height
        // Call the superclass constructor to
        // initialize length and width.

        super(len, w); // this is basically saying => create our Rectangle => and add HEIGHT => create the more general thing, then add a bit of flavour! add new attributes
        height = h;
        // Initialize height.

    }

    /**
     * The getHeight method returns the height
     * field.
     */

    public double getHeight() {
        return height;
    }

    /**
     * The getSurfaceArea method returns the
     * cube's surface area.
     */

    public double getSurfaceArea() {
        return getArea() * 6;
    }

    /**
     * The getVolume method returns the volume of
     * the cube.
     */

    public double getVolume() {
        return getArea() * height;
    }

    public static void main(String[] args) {


        Cube cubeExample = new Cube(10.0, 20.0, 10.0);
        // we can call methods from our specialzed class
        cubeExample.getHeight();
        // or our general class!!
        cubeExample.getLength();
        cubeExample.getWidth();


    }
}