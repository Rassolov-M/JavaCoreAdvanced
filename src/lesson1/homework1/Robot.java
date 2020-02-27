package lesson1.homework1;

public class Robot implements Rivals{

    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;

    boolean energy;

    public Robot(String type, String name, int maxRunDistance, int maxJumpHeight) {
       this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.energy = true;
    }

    public Robot(String name) {
        this("robot_sportsman", name, 5000, 1);
    }

    @Override
    public void run(int distance) {


            if (distance < maxRunDistance){

                if (distance <= maxRunDistance) {
                    System.out.println(type + " " + name + " Справился с бегом");
                    for (int i = 0; i < distance; i++) {
                        break;
                    }
                } else {
                    System.out.println(type + " " + name + " Провалил бег");
                    energy = false;
                }
            }
    }

    @Override
    public void jumping(int height) {
        if(height <= maxJumpHeight){
            System.out.println(type + " " + name + " Перепрыгнул через стену");
        }else{
            System.out.println(type + " " + name + " Не смог перепрыгнуть");
            energy = false;
        }
    }

    @Override
    public boolean isDistance() {
        return energy;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + energy);
    }
}
