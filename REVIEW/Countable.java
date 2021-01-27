package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;
/**
 * This class demonstrates a static field.
 */

public class Countable
{
    // this variable is shared among all COUNTABLE objects
    private static int instanceCount = 0;

    /**
     * The constructor increments the static
     * field instanceCount. This keeps track
     * of the number of instances of this
     * class that are created.
     */

    public Countable()
    {

        // all we 're doing is is incrementing this count !!
        // what does ++ mean? => instanceCount = instanceCount +1;
        instanceCount++;
    }

    /**
     * The getInstanceCount method returns
     * the value in the instanceCount field,
     * which is the number of instances of
     * this class that have been created.
     */

    public int getInstanceCount()
    {
        return instanceCount;
    }
}
