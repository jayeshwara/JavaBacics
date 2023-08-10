package construct;

public class ConstrutorExample {

    String name;
    int id;
    int mark;


    public ConstrutorExample(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

   // public ConstrutorExample() {
  //  }

    // empty constructor is to be created neccessarly . ie. after the example constructor is created .

    // because , in future , if we need , id means , ie .apart from name and mark .

    // we can fill in the empty constructor .

    // ie . public ConstrutorExample(int id) {
                // this.id = id ;
    //    }

    // then in class2 , open a obj2 . for a class1 .



}

