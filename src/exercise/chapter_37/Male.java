package exercise.chapter_37;

public class Male extends FamilyMan implements FamilyRole,EmployeeRole{ //여러개 가능
    private int age;
    private String jop;



    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name + "인 직장동료와 업무를 하고 있습니다.");

    }


    @Override
    public String getName() {
        return this.name;
    }

    public Male(String name) {
        this.name = name;
    }
}
