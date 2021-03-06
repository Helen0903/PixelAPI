package core;

import javax.swing.JPanel;
import core.Render;
import java.awt.Graphics;

/**
 * <br/><i><b>&emsp;&emsp;Canvas</b></i><br/><br/>
 * &emsp;&emsp;&emsp;<tt>public class Canvas()</tt><br/><br/>
 * &emsp;&emsp;A {@link javax.swing.JPanel JPanel} extension with <i>no defined constructor</i>.<br/>
 * &emsp;&emsp;Should be added to a {@link javax.swing.JFrame JFrame} or {@link javax.swing.JWindow JWindow} in order to be used correctly.<br/>
 * &emsp;&emsp;Use a {@link Render Render} instance, override the draw function and manipulate the {@link java.awt.Graphics Graphics} instance from there.<br/><br/>
 * &emsp;&emsp;<b>Initialisation:</b><br/>
 * &emsp;&emsp;&emsp;<tt>Canvas canvas = new Canvas();<br/>
 * &emsp;&emsp;&emsp;canvas.load(myRender);<br/>
 * &emsp;&emsp;&emsp;myJFrame.add(canvas);<br/>
 * &emsp;&emsp;&emsp;myJFrame.repaint();</tt><br/><br/>
 * &emsp;&emsp;<b>See also:</b><br/>
 * &emsp;&emsp;&emsp;{@link #load(Render) load(Render)} - the method used to load {@link Render Renders} into the {@link Canvas} instance.
 */
public class Canvas extends JPanel {
    static final long serialVersionUID = 1l;

    private Render render;
    /**
     * <br/><b>&emsp;&emsp;<i>load</i><br/></b><br/>
     * <tt>&emsp;&emsp;&emsp;public void load({@link core.Render Render} render)</tt><br/><br/>
     * &emsp;&emsp;Load a different {@link Render} instance with a different draw method.<br/>
     * &emsp;&emsp;This makes it easier to switch between different rendering methods.<br/><br/>
     * <b>&emsp;&emsp;Parameters:</b><br/>
     * &emsp;&emsp;&emsp;&emsp;render - the {@link core.Render Render} instance to be used.<br/><br/>
     * &emsp;&emsp;<b>See also:</b><br/>
     * &emsp;&emsp;&emsp;{@link Canvas} - for usage of this command
     * <div style="visibility: hidden;">
     */
    public void load(Render render) {
        this.render = render;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render.draw(g);
    }
}