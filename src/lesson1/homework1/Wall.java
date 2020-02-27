package lesson1.homework1;

public class Wall extends Obstacle{
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Rivals rival) {
        rival.jumping(height);
    }
}
