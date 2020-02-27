package lesson1.homework1;

public class MainTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 200, 4);
        Human human = new Human("Jhonson", 800, 3);
        Robot robot = new Robot("Baymax", 900, 5);

        cat.printActionCat();
        human.printActionHuman();
        robot.printActionRobot();

    }
}
