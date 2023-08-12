package multilevel;

public class ClassOne {

    private String name ;
    private int id ;
    private int salary ;

    public String getName() { return name; }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id; // in set method we give this.id . because , this means , inda class kullara irukura same id la potturu . and anda id is in private . so , ada namma return edukka mudiyadu . so , anda id oda value va , again return edukkura mari , one method iruku . which is get method . so , inda method la return nu koduta , anda value a withdraw pannikilam .
    }

    public void setId(int id) {
        this.id = id; //  private int id value , not to be printed as output . value with free of private , is in getmethod . therefore , set panna value is printed , which does not have -private .
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}