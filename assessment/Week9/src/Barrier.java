
/**
 * Lab 9: Thread Barrier
 * Barrier Class
 *
 * Processes join the barrier and are held until barrierSize processes have
 * joined.
 *
 * @author William Marsh
 *
 */
public class Barrier {

    /**
     * Size of the barrier, which is the minimum number of processes to proceed
     */
    private int barrierSize;


    /**
     * Create a barrier of a given size
     *
     * @param size
     */
    public Barrier(int size) {
        barrierSize = size;
        System.out.println("Barrier size = " + barrierSize);
    }

    /**
     * Processes joins at barrier and either waits or is allowed past
     *
     * @param p The process joining
     * @throws java.lang.InterruptedException
     */
    public void joinBarrier(Process p) throws InterruptedException {
        System.out.println(p.getName() + " waiting on barrier");

        // add code here

        System.out.println(p.getName() + " passed the barrier");
    }
}
