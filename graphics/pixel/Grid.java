package pixel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JFrame;

import core.Canvas;
import core.Render;

public class Grid extends JFrame {
	static final long serialVersionUID = 1l;
	public Pixel[] pixels;
	
	public int xpix; public int xres;
	public int ypix; public int yres;
	
	public Grid(GridSetting setting) {
		setSize(setting.xres+6, setting.yres+29);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setMinimumSize(new Dimension(setting.xres, setting.yres));
		
		this.xpix = setting.xpix; this.xres = setting.xres;
		this.ypix = setting.ypix; this.yres = setting.yres;
		pixels = new Pixel[ypix*xpix];
		for(int y = 0; y<ypix; y++) {
			for(int x = 0; x<xpix; x++) {
				int r = (int) Math.round(Math.random() * 255);
				int g = (int) Math.round(Math.random() * 255);
				int b = (int) Math.round(Math.random() * 255);
				pixels[y*ypix+x] = new Pixel(new Rectangle(x*(xres/xpix), y*(yres/ypix), xres/xpix, yres/ypix), new Color(r, g, b));
			}
		}
		Canvas canvas = new Canvas();
		Render render = new Render() {
			@Override
			public void draw(Graphics g) {
				for(Pixel p : pixels) {
					g.setColor(p.colour);
					g.fillRect(p.shape.x, p.shape.y, p.shape.width, p.shape.height);
				}
			}
		};
		canvas.load(render);
		
		add(canvas);
		
		revalidate();
		repaint();
	}
}
