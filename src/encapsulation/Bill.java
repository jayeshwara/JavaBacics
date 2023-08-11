package encapsulation;

public class Bill {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setName("raghu");
        obj.setId(5);
        obj.setSalary(12000);
        int debtAmt = obj.account(obj.pfamt, obj.getSalary());

        System.out.println("Total Salary : " + obj.getSalary());
        System.out.println("Debited Salary : "+debtAmt);
    }


}
