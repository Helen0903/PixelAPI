import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Color;

import core.Canvas;
import core.Render;

public class CanvasTest extends JFrame {
    static final long serialVersionUID = 1l;

    public static void main(String[] args) {
        new CanvasTest();
    }

    public CanvasTest() {
        super("Canvas Test");
        setSize(600, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        Canvas canvas = new Canvas();
        Render render = new Render() {
            public void draw(Graphics g) {
                g.setColor(new Color(0, 0, 255));
                g.fillRect(0, 0, 600, 480);
            }
        };
        canvas.load(render);

        add(canvas);

        revalidate();
        repaint();
    }
}