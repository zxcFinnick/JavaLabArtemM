package Task1;

public class Circle extends Point {
    private int radius;
    private Point center;

    Circle(int x, int y, int xspeed, int yspeed, int radius, Point center) {
        super(x, y, xspeed, yspeed);
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "MovableCircle: {center: " + center + ", radius = " + radius + "}";
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
