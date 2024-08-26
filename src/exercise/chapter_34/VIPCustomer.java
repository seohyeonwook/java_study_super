package exercise.chapter_34;

public class VIPCustomer extends Customer {

    static int serialNums = 1; // static 변수는 부모꺼를 이어받지 않는다.


    private String agentID;
    private double discountRatio;

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio; // 포인트
        price -= price * discountRatio; // 할인
        return  price;
    }

    public void callAgent() {
        System.out.println("담당직원 " + this.agentID+ "님 문의 드릴게 있어요");
    }

    public VIPCustomer(String name) {
        super();// 자식 생성자는  부모 생성자super붙여야함 그리고 부모에서는 기본생성자 하나만들어야함
        this.customerID = "VIP"+ serialNums ++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    void printMyInfo() {
        System.out.print("VIP"); // VIP 붙이기
        super.printMyInfo();
    }
}
