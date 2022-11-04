import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import oslab8.Animator2;

/**
 * The frame holds the button and the canvas and is the main program.
 *
 * @author William
 * @version January 2010
 */
public class BallFrame extends Frame {

    /**
     * Diameter used in ball constructor
     */
    private static final int DIAMETER = 50;

    private Thread thread;

    /**
     * The animator - the thread creating the animation
     */
    private Animator2 animator;  // the animator thread object

    /**
     * The ball
     */
    private Ball ball;          // the ball

    /**
     * The canvas
     */
    private BallCanvas canvas;  // the canvas for drawing the ball

    /**
     * The button
     */
    private Button button;

    /**
     * Constructor the components (the canvas and the button) and lay them out.
     * Add listeners for the button and for the frame closing event.
     */
    public BallFrame() {
        super();

        // set the title
        this.setTitle("Bouncing Balls 1");

        // set the layout manager
        this.setLayout(new BorderLayout());

        // create a ball and canvas
        ball = new Ball(DIAMETER);
        canvas = new BallCanvas(ball);
        this.add(canvas, BorderLayout.NORTH);

        // create a button
        button = new Button("START");
        this.add(button, BorderLayout.SOUTH);

	// add the button action listener
        // the first press creates the animator and starts it
        // more presses do nothing
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (animator == null) {
                    animator = new Animator2(ball, canvas);
                    animator.start();
          //      } else {
                    //          System.out.println("hello");
                }
            }
        });

        // show the frame
        this.pack();
        this.setVisible(true);

        // add listener to close
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                animator.interrupt();
                System.exit(0);
            }
        });
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        // create the ball frame
        new BallFrame();
    }
}
