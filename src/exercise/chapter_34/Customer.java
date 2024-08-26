package exercise.chapter_34; // 객체 상속 실습 백화점 관리 시스템

public class Customer {
    // 속성
    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusPointRatio;

    // 행위

    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }
    Customer() {

    }

    Customer(String name) {
        this.customerID = "Customer" + serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    void printMyInfo() { // ****
        System.out.printf("Customer(customerId= %s,name = %s, customerGrade= %s, bonusPoint = %d \n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }
}
