package lesson1.homework1;

public class Cat {
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

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public Cat() {

    }

    public void printActionCat(){
        System.out.println(name + " пробежал! " + run + " метроа и прыгнул на " + jump + " метра(ов)");
    }
}
