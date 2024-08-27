package exercise.chapter_43;

public class Staff {
    private int salesAmount;

    public int helpPayment(Customer customer, int price) {
        return customer.calculatePrice(price);

    }
//    public int helpPayment(VIPCustomer vipCustomer, int price) {
//        return vipCustomer.calculatePrice(price);
//    }

    public void addSalesAmount(int cash) {
        salesAmount += cash;

    }
    public void printMySalesAmount() {
        System.out.println("오늘의 최종 매출 액은 " + this.salesAmount + "원 입니다.");

    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }


}
