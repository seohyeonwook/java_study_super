package exercise.chapter_36; // 인터페이스 -implements

public class Airplane implements Flyable{

    // 속성
    private String airplaneID;
    private long remainingFuelAmount;
    private long maximumCapacity;

    @Override// 무조건 해야함
    public void fly() {
        System.out.println("비행기 ID: "+airplaneID+ " 가 납니다.");

    }

    public void refillFuel(long fuel) {
        remainingFuelAmount += fuel;
    }

    public Airplane(String airplaneID) {
        this.airplaneID = airplaneID;
    }
}
