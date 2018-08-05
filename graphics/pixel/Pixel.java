package pixel;

import java.awt.Color;
import java.awt.Rectangle;
/**
 * <br/><b><i>&emsp;&emsp;Pixel</i></b><br/><br/>
 * &emsp;&emsp;&emsp;<tt>public class {@link #Pixel(int, int, int, int, int, int, int) Pixel}(int x, int y, int width, int height, int r, int g, int b)<br/>
 * &emsp;&emsp;&emsp;public class {@link #Pixel(int, int, int, int, Color) Pixel}(int x, int y, int width, int height, {@link java.awt.Color Color} c)<br/>
 * &emsp;&emsp;&emsp;public class {@link #Pixel(Rectangle, int, int, int) Pixel}({@link java.awt.Rectangle Rectangle} shape, int r, int g, int b)<br/>
 * &emsp;&emsp;&emsp;public class {@link #Pixel(Rectangle, Color) Pixel}({@link java.awt.Rectangle Rectangle} shape, {@link java.awt.Color Color} c)</tt><br/><br/>
 * &emsp;&emsp;Pixel is a simple class that most users will most likely never have to use.<br/>
 * &emsp;&emsp;The lowest constructor is the one that is defined, whereas all the others are overloads which generate the {@link java.awt.Rectangle Rectangle} and {@link java.awt.Color Color} objects for you.<br/><br/>
 * &emsp;&emsp;<b>Parameters:</b><br/>
 * &emsp;&emsp;&emsp;<i>Place and size parameters:</i><br/>
 * &emsp;&emsp;&emsp;x - the x-coordinate of the pixel<br/>
 * &emsp;&emsp;&emsp;y - the y-coordinate of the pixel<br/>
 * &emsp;&emsp;&emsp;width - the width of the pixel (in actual pixels)<br/>
 * &emsp;&emsp;&emsp;height - the height of the pixel (in actual pixels)<br/>
 * &emsp;&emsp;&emsp;shape - the {@link java.awt.Rectangle Rectangle} instance that has all of the above in one object<br/><br/>
 * &emsp;&emsp;&emsp;<i>Colour parameters:</i><br/>
 * &emsp;&emsp;&emsp;r - the red value of the colour<br/>
 * &emsp;&emsp;&emsp;g - the green value of the colour<br/>
 * &emsp;&emsp;&emsp;b - the blue value of the colour<br/>
 * &emsp;&emsp;&emsp;c - the {@link java.awt.Color Color} instance that has the 3 above in one object<br/><br/>
 * &emsp;&emsp;<b>See also:</b><br/>
 * &emsp;&emsp;&emsp;{@link #shape} - the {@link java.awt.Rectangle Rectangle} instance used for the Pixel class.<br/>
 * &emsp;&emsp;&emsp;{@link #colour} - the {@link java.awt.Color Color} instance used for the Pixel class.
 */
public class Pixel {
	/**
	 * <br/><b><i>&emsp;&emsp;shape</i></b><br/><br/>
	 * &emsp;&emsp;&emsp;<tt>public {@link java.awt.Rectangle Rectangle} shape</tt><br/><br/>
	 * &emsp;&emsp;The {@link java.awt.Rectangle Rectangle} instance defining the size and location of this {@link pixel.Pixel Pixel}.<br/>
	 * &emsp;&emsp;The x and y coordinates at the beginning define how many {@link pixel.Pixel Pixels} along and down this particular pixel is.<br/>
	 * &emsp;&emsp;The width and height define the horizontal and vertical size of the {@link Pixel} (in actual pixels).
	 */
	public Rectangle shape;
	/**
	 * <br/><b><i>&emsp;&emsp;colour</i></b><br/><br/>
	 * &emsp;&emsp;&emsp;<tt>public {@link java.awt.Color Color} colour</tt><br/><br/>
	 * &emsp;&emsp;The {@link java.awt.Color Color} instance defining the colour of this {@link pixel.Pixel Pixel}.<br/>
	 * &emsp;&emsp;The r, g and b values required to make a {@link java.awt.Color Color} instance are in the RGB format.
	 */
	public Color colour;
	
	/**
	 * <br/><b><i>&emsp;&emsp;Pixel constructor &ltOverload #1&gt</b></i><br/><br/>
	 * <tt>&emsp;&emsp;&emsp;public Pixel(int x, int y, int width, int height, int r, int g, int b)</tt><br/><br/>
	 * &emsp;&emsp;The first of 3 {@link pixel.Pixel Pixel} constructor overloads.<br/><br/>
	 * &emsp;&emsp;<b>Parameters:</b><br/>
	 * &emsp;&emsp;&emsp;<i>Place and size parameters:</i><br/>
	 * &emsp;&emsp;&emsp;x - the x-coordinate of the pixel<br/>
	 * &emsp;&emsp;&emsp;y - the y-coordinate of the pixel<br/>
	 * &emsp;&emsp;&emsp;width - the width of the pixel (in actual pixels)<br/>
	 * &emsp;&emsp;&emsp;height - the height of the pixel (in actual pixels)<br/><br/>
	 * &emsp;&emsp;&emsp;<i>Colour parameters:</i><br/>
	 * &emsp;&emsp;&emsp;r - the red value of the colour<br/>
	 * &emsp;&emsp;&emsp;g - the green value of the colour<br/>
	 * &emsp;&emsp;&emsp;b - the blue value of the colour<br/>
	 * <div style="visibility: hidden;">
	 */
	public Pixel(int x, int y, int width, int height, int r, int g, int b) { this(new Rectangle(x, y, width, height), new Color(r, g, b)); }
	/**
	 * <br/><b><i>&emsp;&emsp;Pixel constructor &ltOverload #2&gt</b></i><br/><br/>
	 * <tt>&emsp;&emsp;&emsp;public Pixel(int x, int y, int width, {@link java.awt.Color Color} c)</tt><br/><br/>
	 * &emsp;&emsp;The second of 3 {@link pixel.Pixel Pixel} constructor overloads.<br/><br/>
	 * &emsp;&emsp;<b>Parameters:</b><br/>
	 * &emsp;&emsp;&emsp;<i>Place and size parameters:</i><br/>
	 * &emsp;&emsp;&emsp;x - the x-coordinate of the pixel<br/>
	 * &emsp;&emsp;&emsp;y - the y-coordinate of the pixel<br/>
	 * &emsp;&emsp;&emsp;width - the width of the pixel (in actual pixels)<br/>
	 * &emsp;&emsp;&emsp;height - the height of the pixel (in actual pixels)<br/><br/>
	 * &emsp;&emsp;&emsp;<i>Colour parameters:</i><br/>
	 * &emsp;&emsp;&emsp;c - the {@link java.awt.Color Color} instance that has the 3 RGB values in one object
	 * <div style="visibility: hidden;">
	 */
	public Pixel(int x, int y, int width, int height, Color c) { this(new Rectangle(x, y, width, height), c); }
	/**
	 * <br/><b><i>&emsp;&emsp;Pixel constructor &ltOverload #3&gt</b></i><br/><br/>
	 * <tt>&emsp;&emsp;&emsp;public Pixel({@link java.awt.Rectangle Rectangle} shape, int r, int g, int b)</tt><br/><br/>
	 * &emsp;&emsp;The third of 3 {@link pixel.Pixel Pixel} constructor overloads.<br/><br/>
	 * &emsp;&emsp;<b>Parameters:</b><br/>
	 * &emsp;&emsp;&emsp;<i>Place and size parameters:</i><br/>
	 * &emsp;&emsp;&emsp;shape - the {@link java.awt.Rectangle Rectangle} instance that has all of the coordinate and size parameters in one object<br/><br/>
	 * &emsp;&emsp;&emsp;<i>Colour parameters:</i><br/>
	 * &emsp;&emsp;&emsp;r - the red value of the colour<br/>
	 * &emsp;&emsp;&emsp;g - the green value of the colour<br/>
	 * &emsp;&emsp;&emsp;b - the blue value of the colour<br/>
	 * <div style="visibility: hidden;">
	 */
	public Pixel(Rectangle shape, int r, int g, int b) { this(shape, new Color(r, g, b)); }
	/**
	 * <br/><b><i>&emsp;&emsp;Pixel constructor</b></i><br/><br/>
	 * <tt>&emsp;&emsp;&emsp;public Pixel({@link java.awt.Rectangle Rectangle} shape, {@link java.awt.Color Color} c)</tt><br/><br/>
	 * &emsp;&emsp;The "actual" {@link pixel.Pixel Pixel} constructor.<br/><br/>
	 * &emsp;&emsp;<b>Parameters:</b><br/>
	 * &emsp;&emsp;&emsp;<i>Place and size parameters:</i><br/>
	 * &emsp;&emsp;&emsp;shape - the {@link java.awt.Rectangle Rectangle} instance that has all of the coordinate and size parameters in one object<br/><br/>
	 * &emsp;&emsp;&emsp;<i>Colour parameters:</i><br/>
	 * &emsp;&emsp;&emsp;c - the {@link java.awt.Color Color} instance that has the 3 RGB values in one object
	 * <div style="visibility: hidden;">
	 */
	public Pixel(Rectangle shape, Color c) {
		this.shape = shape;
		this.colour = c;
	}
	
	/**
	 * <br/><b><i>&emsp;&emsp;Clone function</b></i><br/><br/>
	 * <tt>&emsp;&emsp;&emsp;clone()</tt><br/><br/>
	 * &emsp;&emsp;Creates a non-linked copy of this object.<br/><br/>
	 * &emsp;&emsp;<b>Overrides:</b> {@link Object#clone() clone()} in {@link Object}.<br/>
	 * &emsp;&emsp;<b>Returns:</b><br/>
	 * &emsp;&emsp;&emsp;a clone of this instance.
	 * <div style="visibility: hidden">
	 */
	public Pixel clone() {
		return new Pixel(shape.x, shape.y, shape.width, shape.height, colour.getRed(), colour.getGreen(), colour.getBlue());
	}
}