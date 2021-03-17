package CH_9;

public class PhysicsStudent extends Student{


    /**
     * The Constructor accepts as arguments the student's
     * name, ID number, and the year admitted.
     *
     * @param n
     * @param id
     * @param year
     */
    public PhysicsStudent(String n, String id, int year) {
        super(n, id, year);
    }

    @Override
    public int getRemainingHours() {
        return 0;
    }

    @Override
    public boolean hasRequiredStage() {
        return false;
    }
}
