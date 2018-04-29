public class Pixel {
    public int x;
    public int y;
    public int[] c;
    public int width;
    public int height;
    public Pixel(int x, int y, int width, int height, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.c = new int[] {r,g,b};
        this.width = width;
        this.height = height;
    }

    public void setColor(int r, int g, int b) {
        this.c = new int[] {r,g,b};
    }
}