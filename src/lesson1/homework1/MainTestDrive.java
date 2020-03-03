package lesson1.homework1;

public class MainTestDrive {
    public static void main(String[] args) {

        Rivals[] user = {
            new Human("Zak"),
            new Robot("Beimax"),
            new Cat( "Cat","Barsick")
        };

        Obstacle[] obstacles = {
                new RunnigTrack(3000),
                new Wall(3)
        };

        for (Rivals rival : user){
            for (Obstacle o : obstacles) {
                o.doIt(rival);
                if(!rival.isDistance()){
                    break;
                }
            }
        }

        for ( Rivals rival : user) {
            rival.info();
        }
    }
}
