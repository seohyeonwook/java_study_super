package exercise.chapter_37;

public class InterfaceTest {
    public static void main(String[] args) {
        // Male 3개의 역할  - 남편, 아빠, 회사원

        // 남편 역할
        HusbandRole male = new Male("철쑤");
        WifeRole wife = new Female("영희");

        male.sayLoveEveryDay();
        male.takeCareWife(wife);

        // 아빠 역할
        DaddyRole maleDaddy = (DaddyRole) male; // 철수가 일로옴  Husband -> Daddy타입 형변환
        Baby baby = new Baby("민수");

        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryDay();

        // 회사원
        EmployeeRole maleEmployee = (EmployeeRole) maleDaddy;
        EmployeeRole maleEmployeeTwo = new MaleTwo("민철");

       maleEmployee.workTogether(maleEmployeeTwo);



    }
}
