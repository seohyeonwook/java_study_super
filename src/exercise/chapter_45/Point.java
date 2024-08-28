package exercise.chapter_45;

public class Point<T extends Number, V extends Number> { // 이렇게 넘버 상속하면 넘버 하위 애들만 들어옴

    private  T x;
    private  V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public Double calculateDistance() {
//        if ( !(this.x instanceof Number) ) {
//            return null; // 둘다 넘버가 아니면 null
//        }
//        if (! (this.y instanceof  Number)) {
//            // instanceof 어떤 타입인지 아닌지 검사하는거 - 여기서는 Number 타입이 아니면
//            return null;
//        }
        // if 둘다 통과하면 - 근데 이것도 필요없게 만들수 있다 들어오는 타입이 Number인것만 확인하면 됨 위에 올라가서
        //                  Number상속받으면  Number타입만 들어옴
        Double num1 =  this.x.doubleValue();
        Double num2 =  this.y.doubleValue();

        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2) );
    }
}
