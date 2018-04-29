import javax.swing.JPanel;
import java.awt.Graphics;

public class Canvas extends JPanel {
    final static long serialVersionUID = 1l;
    
    private Render render;
    /**
     * Loads a render and returns the Canvas instance for easy chaining of commands.
     */
    public Canvas load(Render render) {
        this.render = render;
        return this;
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        render.draw(g);
    }
}