package builderstring;

public class BuilderClass {

    public static void main(String[] args) {

        StringBuilder reverse = new StringBuilder();

        String name = "India";
        reverse.append(name); // append is : add the upcoming giving data in the sb .
        System.out.println(name);
        // where now the only one data in the sb . so ,
        reverse.reverse();  // we have already builded a program for reverse of string operation . therefore , by using stringbuilder , we can retrive that operation , via the method name itself .
        System.out.println(reverse);

    }
}

