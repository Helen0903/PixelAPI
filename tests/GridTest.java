import java.awt.Color;
import java.awt.Rectangle;
import java.util.Scanner;

import pixel.Grid;
import pixel.GridSetting;

public class GridTest {
	public static void main(String[] args) {
		Grid grid = new Grid(new GridSetting(500, 500, 50, 50));
		grid.setRect(new Rectangle(1, 1, 20, 20), new Color(255, 255, 255));
		Scanner s = new Scanner(System.in);
		s.nextLine();
		s.close();
		grid.resize(250, 250);
	}
}