import java.awt.Color;
import java.awt.Rectangle;

import pixel.Grid;
import pixel.GridSetting;

public class GridTest {
	public static void main(String[] args) {
		Grid grid = new Grid(new GridSetting(500, 500, 50, 50));
		grid.setRect(new Rectangle(0, 0, 50, 50), new Color(255, 255, 255));
	}
}