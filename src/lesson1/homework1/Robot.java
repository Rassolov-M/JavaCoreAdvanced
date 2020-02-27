package lesson1.homework1;

public class Robot {
    private String name;
    private int run;
    private int jump;

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    public Robot (String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public Robot() {

    }

    public void printActionRobot(){
        System.out.println(name + " пробежал! " + run + " метроа и прыгнул на " + jump + " метра(ов)");
    }
}
