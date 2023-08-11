package multilevel;

public class ClassThree extends ClassOne {

    public static void main(String[] args) {


        ClassThree obj = new ClassThree();
        ClassTwo obj1 = new ClassTwo();

        int pfamt = 1000 ;
        obj.setName("raghu");
        obj.setId(5);
        obj.setSalary(12000);
        int debtAmt = obj1.account(pfamt, obj.getSalary());

        System.out.println("Total Salary : " + obj.getSalary());
        System.out.println("Debited Salary : "+debtAmt);
    }
}
