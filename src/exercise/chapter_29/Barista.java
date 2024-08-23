package exercise.chapter_29;

// 시나리오 참고
// 1. 바리스타 는 아메리카노 주문 확인을 알린다.
// 2. 바리스타는 물 500ml와 원두 30g 로 아메리카노 커피 만든다
// 3. 바리스타는 아메리카노 커피 완성을 알린다
public class Barista {

    // 속성

    //행위
    public void noticeOrder(String coffeeName) { // 주문 확인한다
        System.out.println("바리스타: 커피주문 확인했습니다 커피: "+ coffeeName );
    }

    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) { // 커피 만든다
        Coffee coffee = new Coffee(coffeeName, waterQuantity,coffeeBeanQuantity);
        return coffee;
    }

    public void sayCoffeeReady(Coffee coffee) { // 커피 완성알린다
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작이 완료되었습니다. 커피: " +coffeeName);
    }
}
