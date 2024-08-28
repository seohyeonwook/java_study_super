package exercise.chapter_45;

public class PointSituation {
    public static void main(String[] args) {
        Point<Integer, Integer> point1 = new Point<>(1 ,5);
        Point<Integer, Double> point2 = new Point<>(1,2.44);
        Point<Double, Double> point3 = new Point<>(2.33, 5.44);

        System.out.println(point1.calculateDistance());
        System.out.println(point2.calculateDistance());
        System.out.println(point3.calculateDistance());



    }
}
