package lesson1.homework1;

public class Cat implements Rivals {
     String type;
     String name;
     int maxRunDistance;
     int maxJumpHeight;

    boolean onDistance;

    public Cat(String type, String name, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Cat(String type, String name) {
        this(type, name, 800, 2);
    }

    @Override
    public void run(int distance) {


            if(distance <= maxRunDistance){
                System.out.println(name + " Успешно пробежал");
                for (int i = 0; i < distance; i++) {
                    break;
                }
            }
            else{
                System.out.println(name + " Не смог пробежать");
                onDistance = false;
            }

    }

    @Override
    public void jumping(int height) {
        if(height <= maxJumpHeight){
            System.out.println(name + " Перепрыгнул через стену");
        }else{
            System.out.println(name + " Не смог перепрыгнуть");
            onDistance = false;
        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " " + onDistance);
    }

}
