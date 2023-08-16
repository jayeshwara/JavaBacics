package polymorphism;

public class Rectangle extends Circle {

    @Override
    public double areac(double pi, double r) {
        return super.areac(3.14, 2);
    }

    @Override
    public double perimeterc(double pi, double r, double p) {
        return super.perimeterc(3.14, 4, 5);
    }



    public int area(int l, int w) {
        System.out.println("Area of rectangle : " + l*w);
        return l*w ;

    }
    public int perimeter(int v,int l,int w) {
        int d = v*(l+w) ;
        System.out.println("Perimeter of rectangle : " + d);
        return d ;

    }
}