package polymorphism;

public class Circle extends Shape {


    public double areac(double pi,double r) {
        double area = pi * r * r ;
        System.out.println("Area of circle : " +area);
        return area ;
    }

    public double perimeterc(double pi,double r,double p) {
        System.out.println("Perimeter of circle : " + p * pi * r);
        return p * pi * r ;

    }




}




