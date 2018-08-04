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
	
	private Canvas canvas;
	
	/**
	 * The constructor for a Grid.<br/>
	 * Requires a GridSetting to be specified.
	 * @param setting The GridSetting instance to be used.
	 */
	public Grid(GridSetting setting) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		
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
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(xres, yres));;
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
		pack();
		
		revalidate();
		repaint();
	}
	
	private int[] uRange(int to) {
		int[] ret = new int[to];
		for(int x=0;x<to;x++) {
			ret[x] = x;
		}
		return ret;
	}
	
	/**
	 * This function sets the pixel at the specified (x, y) coordinate to the specified colour (c).<br/>
	 * The colour should be specified as a Color object, part of `java.awt`.
	 * @param x The x-coordinate.
	 * @param y The y-coordinate.
	 * @param c The Color object to set it to.
	 * @return Whether or not the pixel has been changed.
	 */
	public boolean setPixel(int x, int y, Color c) {
		this.pixels[y*ypix+x] = new Pixel(new Rectangle(x*(xres/xpix), y*(yres/ypix), xres/xpix, yres/ypix), c);
		return this.pixels[y*ypix+x].colour == c;
	}
	
	public boolean setRect(int x, int y, int width, int height, Color c) { return setRect(new Rectangle(x, y, width, height), c); }
	public boolean setRect(Rectangle r, Color c) {
		boolean ret = true;
		for(int y : uRange(r.height)) {
			for(int x : uRange(r.width)) {
				ret = ret && setPixel(r.x+x, r.y+y, c);
			}
		}
		return ret;
	}
	
	/**
	 * Weird name due to conflicts with Component's deprecated resize() method.<br/>
	 * This function resizes the grid to x real-pixels by y real-pixels.<br/>
	 * The inner Pixels are also resized to fit the space correctly.<br/>
	 * <b>This does not change the amount of Pixels in the Grid, only its size.</b>
	 * @param x the new x dimension of the grid, in real-pixels
	 * @param y the new y dimension of the grid, in real-pixels
	 */
	public void repixelise(int x, int y) {
		canvas.setPreferredSize(new Dimension(x, y));
		
		for(Pixel p : pixels) {
			p.shape = new Rectangle(Math.round(p.shape.x*((float) x/xres)), Math.round(p.shape.y*((float) y/yres)), x/xpix, y/ypix);
		}
		
		xres = x; yres = y;
		pack();
		revalidate();
		repaint();
	}
}
