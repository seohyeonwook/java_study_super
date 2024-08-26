package exercise.chapter_36;

public class InterfaceTest2 {
    public static void main(String[] args) {
        //Drone

        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB23213");
        drone.fly();
        airplane.fly();

        if( drone instanceof Drone) {
            Drone dron2 = (Drone) drone;
            dron2.takePicture();
        }
    }
}
