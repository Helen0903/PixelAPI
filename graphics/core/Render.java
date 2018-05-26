package core;

import java.awt.Graphics;

/**
 * <br/><i><b>&emsp;&emsp;Render</b></i><br/><br/>
 * &emsp;&emsp;&emsp;<tt>public interface Render()</tt><br/><br/>
 * &emsp;&emsp;A simple interface with no defined constructor.<br/><br/>
 * &emsp;&emsp;<b>Initialisation:</b><br/>
 * &emsp;&emsp;&emsp;<tt>Render render = new Render() {<br/>
 * &emsp;&emsp;&emsp;&emsp;public void draw({@link java.awt.Graphics Graphics} g) {<br/>
 * &emsp;&emsp;&emsp;&emsp;&emsp;// Your code<br/>
 * &emsp;&emsp;&emsp;&emsp;}<br/>
 * &emsp;&emsp;&emsp;};</tt>
 */
public interface Render {
    /**
     * <br/><i><b>&emsp;&emsp;draw</b></i><br/><br/>
     * &emsp;&emsp;&emsp;<tt>public void draw({@link java.awt.Graphics Graphics} g);</tt><br/><br/>
     * &emsp;&emsp;A Runnable-esque function to allow for remote function execution.<br/>
     * &emsp;&emsp;Simply override this and add in your own code to change the graphics.<br/>
     * &emsp;&emsp;<b>This function should never be called in your code!</b><br/><br/>
     * &emsp;&emsp;<b>Implementation:</b><br/>
     * &emsp;&emsp;&emsp;When initialising a {@link Render} instance, just use the following code to override this method:<br/>
     * &emsp;&emsp;&emsp;&emsp;<tt>Render render = new Render() {<br/>
     * &emsp;&emsp;&emsp;&emsp;&emsp;public void draw({@link java.awt.Graphics Graphics} g) {<br/>
     * &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;// Your code<br/>
     * &emsp;&emsp;&emsp;&emsp;&emsp;}<br/>
     * &emsp;&emsp;&emsp;&emsp;};</tt><br/><br/>
     * &emsp;&emsp;<b>Parameters:</b><br/>
     * &emsp;&emsp;&emsp;g - the {@link java.awt.Graphics Graphics} instance to be used.
     * <div style="visibility: hidden;">
     */
    public void draw(Graphics g);
}