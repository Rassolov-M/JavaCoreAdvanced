package lesson1.homework1;

public class Human implements Rivals{
    String name;
    int maxRunDistance;
    int maxJumpHeight;

    boolean active;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Human(String name) {
        this(name, 2000, 5);
    }

    @Override
    public void run(int distance) {
        if(distance <= maxRunDistance){
            System.out.println(name + " Справился с бегом");
            for (int i = 0; i < distance; i++) {
                break;
            }
        }else{
            System.out.println(name + " Провалил бег");
            active = false;
        }

    }

    @Override
    public void jumping(int height) {
        if(height <= maxJumpHeight){
            System.out.println(name + " Перепрыгнул через стену");
        }else{
            System.out.println(name + " Не смог перепрыгнуть");
            active = false;
        }
    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }

}
