package lesson1.homework1;

public class RunnigTrack extends Obstacle {
    int length;

    public RunnigTrack(int length) {
        this.length = length;
    }


    @Override
    public void doIt(Rivals rival) {
        rival.run(length);
    }
}
