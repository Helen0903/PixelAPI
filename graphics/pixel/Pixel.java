package pixel;

import java.awt.Color;
import java.awt.Rectangle;

public class Pixel {
	public Rectangle shape;
	public Color colour;
	
	public Pixel(int x, int y, int width, int height, int r, int g, int b) { this(new Rectangle(x, y, width, height), new Color(r, g, b)); }
	public Pixel(int x, int y, int width, int height, Color c) { this(new Rectangle(x, y, width, height), c); }
	public Pixel(Rectangle shape, int r, int g, int b) { this(shape, new Color(r, g, b)); }
	public Pixel(Rectangle shape, Color c) {
		this.shape = shape;
		this.colour = c;
	}
}