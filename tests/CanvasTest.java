import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

import core.Canvas;
import core.Render;

public class CanvasTest extends JFrame {
    static final long serialVersionUID = 1l;

    public static void main(String[] args) {
        new CanvasTest();
    }

    public CanvasTest() {
        super("Canvas Test");
        double screen_height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double screen_width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        setLocation((int) (screen_width-600)/2, (int) (screen_height-480)/2);
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