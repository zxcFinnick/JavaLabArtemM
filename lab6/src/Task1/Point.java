package Task1;

public class Point implements Movable {
    protected int x;
    protected int y;
    protected int xspeed;
    protected int yspeed;

    Point(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint: {x = " + x + ", y = " + y + ", xSpeed = " + xspeed + ", ySpeed = " + yspeed + "}";
    }

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }
}
