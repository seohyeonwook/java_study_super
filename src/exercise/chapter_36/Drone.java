package exercise.chapter_36;

public class Drone implements Flyable{ //Flyable에 디폴트 붙어있어서 강제로 구현 안해도됨

    private String droneID;
    private long remainingFuelAmount;
    private long remainingFileStorage;

    public void takePicture() {
        Flyable.printLanding();
        System.out.println("이 드론은 사진을 찍고 있읍니다.");
    }
}
