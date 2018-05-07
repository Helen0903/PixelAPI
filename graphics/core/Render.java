package core;

import java.awt.Graphics;

public interface Render {
    /**
     * A Runnable-esque function to allow for remote function execution.
     */
    public void draw(Graphics g);
}