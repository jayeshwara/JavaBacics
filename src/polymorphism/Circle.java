package polymorphism;

public class Circle extends Shape {

    @Override
    public int getArea(int area) {
        return super.getArea(5);
    }

    @Override
    public int getPerimeter(int perimeter) {
        return super.getPerimeter(7);
    }

    double pi = 3.14 ;
    double r ;

    public  double area(double pi,double r) {
        double area = pi * r * r ;
          return area ;
    }

    public double perimeterc(double pi,double r) {
           return 2 * pi * r ;

    }


}




