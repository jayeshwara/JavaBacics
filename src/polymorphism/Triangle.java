package polymorphism;

public class Triangle extends Rectangle {


    double c = 1/2 ; double b = 2 ; double h = 5 ; double d = 9 ;

    public double area(double b,double h) {
        return c * b * h ;
    }
    public double perimeter(double b,double d,double h) {
        return b+d+h ;
    }

    public static void main(String[] args) {

        Triangle obj = new Triangle();

        obj.area(3,4);
        obj.perimeter(3,5);



    }

}
