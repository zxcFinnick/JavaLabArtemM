package Task2;

public class Rectangle extends Point {
    private Point topleft;
    private Point bottomright;

    Rectangle(int x, int y, int xspeed, int yspeed, Point topleft, Point bottomright) {
        super(x, y, xspeed, yspeed);
        this.bottomright = bottomright;
        this.topleft = topleft;
    }

    @Override
    public String toString() {
        return "MovableRectangle: {topLeft" + topleft.toString() + "bottomRight" + bottomright.toString() + "}";
    }

    public void check() {
        this.topleft.xspeed = this.bottomright.xspeed;
        this.topleft.yspeed = this.bottomright.yspeed;
    }
}
