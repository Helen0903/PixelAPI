package core;

import javax.swing.JPanel;
import core.Render;
import java.awt.Graphics;

public class Canvas extends JPanel {
    static final long serialVersionUID = 1l;

    private Render render;
    public void load(Render render) {
        this.render = render;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render.draw(g);
    }
}