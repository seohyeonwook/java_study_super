package exercise.chapter_45;// 제너릭 - 무슨타입이 들어갈지 모르니  제너릭<T>으로 정해주고 사용하는 코드에서는 변수명을 따로 입력한다

public class GeneralPrint2<T> { // 선언할때 타입이 정해진다
    private T material; // 타입을 자꾸바꾸니까 그냥 Object로 선언함 - 제너릭은 2개이상 가능함

    public void printMyInfo(){
        System.out.println(material + "를 출력합니다.");
    }

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return this.material;
    }
}

