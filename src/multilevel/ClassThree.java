package multilevel;

public class ClassThree extends ClassTwo {



    public static void main(String[] args) {


        ClassThree obj = new ClassThree();



        int pfamt = 1000 ;
        obj.setName("raghu");
        obj.setId(5);
        obj.setSalary(12000);
        int debtAmt = obj.account(pfamt, obj.getSalary());




        System.out.println("Total Salary : " + obj.getSalary());
        System.out.println("Debited Salary : "+debtAmt);
    }
}
