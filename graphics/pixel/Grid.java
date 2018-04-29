import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Grid extends JFrame {
    final static long serialVersionUID = 1l;

    public int[] graphicsResolution = new int[2];
    public int[] pixelResolution = new int[2];
    public Pixel[] pixels;
    public Grid(String title, int xres, int yres, int xpix, int ypix) {
        super(title);
        graphicsResolution[0] = xres;
        graphicsResolution[1] = yres;
        pixelResolution[0] = xpix;
        pixelResolution[1] = ypix;
        setSize(graphicsResolution[0], graphicsResolution[1]);
        setVisible(true);
        pixels = new Pixel[xpix*ypix];
        for(int y = 0; y<ypix; y++) {
            for(int x = 0; x<xpix; x++) {
                pixels[y*ypix + x] = new Pixel(x, y, (int )Math.floor(xres/xpix), (int) Math.ceil(yres/ypix), 0, 0, 255);
            }
        }
        for(Pixel x : pixels) {
            System.out.println(x.x);
        }
        Canvas canvas = new Canvas();
        canvas.load(new Render() {
            @SuppressWarnings("unused")
            public void draw(Graphics g) {
                for(Pixel x : pixels) {
                    g.setColor(new Color(x.c[0], x.c[1], x.c[2]));
                    g.fillRect(x.x, x.y, x.width, x.height);
                }
            }
        });
        add(canvas);
        this.revalidate();
        this.repaint();
    }
}