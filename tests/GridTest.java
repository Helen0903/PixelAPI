import java.awt.Color;
import java.awt.Rectangle;

import pixel.Grid;
import pixel.GridSetting;

public class GridTest {
	public static void main(String[] args) throws InterruptedException {
		Grid grid = new Grid(new GridSetting(500, 500, 50, 50));
		grid.setRect(new Rectangle(1, 1, 20, 20), new Color(255, 255, 255));
		Thread.sleep(1000);
		grid.repixelise(250, 250);
	}
}