package lesson1.homework1;

public class Human {
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

    public Human(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public Human() {

    }

    public void printActionHuman(){
        System.out.println(name + " пробежал! " + run + " метроа и прыгнул на " + jump + " метра(ов)");
    }
}
