/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oslab8;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author LatinoWolofKid
 */
public class Animator2 implements Runnable {

    /**
     * The ball
     */
    private Ball ball;

    /**
     * The canvas on which the ball is drawn
     */
    private BallCanvas canvas;


    /**
     * Constructor for the animator
     *
     * @param theBall the ball to be animated
     * @param theCanvas the canvas for painting the animation
     */
    public Animator2(Ball theBall, BallCanvas theCanvas) {
        ball = theBall;
        canvas = theCanvas;
    }

    /**
     * Run the animation
     */
    public void run() {
        while (!Thread.interrupted() && !ball.atRightEdge()) {
            ball.move();
            canvas.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
