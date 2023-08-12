package multilevel;

public class ClassTwo extends ClassOne{


   public int account(int pfamt, int getsalary) {
        return  getSalary() - pfamt;
    }

}

// when we give an extend keyword , defaultly , ClassOne gene is copied to ClassTwo .
// so , therefore , when we give , ClassThree extends ClassTwo , the ClassOne , is Maraimugama having
