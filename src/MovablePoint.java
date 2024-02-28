public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int speedX;
    private int speedY;

    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    @Override
    public void moveUp() {
        System.out.println(y-=speedY);
    }

    @Override
    public void moveDown() {
        System.out.println(y+=speedY);
    }

    @Override
    public void moveLeft() {
        System.out.println(x-=speedX);
    }

    @Override
    public void moveRight() {
        System.out.println(x+=speedX);
    }
}
