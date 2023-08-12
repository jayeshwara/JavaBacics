package polymorphism;

public class Rectangle extends Circle {

    @Override
    public int getArea(int area) {
        return super.getArea(7);
    }

    @Override
    public int getPerimeter(int perimeter) {
        return super.getPerimeter(2);
    }

    int l  ; int w  ;

    public int area(int l,int w) {
        System.out.println("Area of rectangle : " + l*w);
        return l*w ;

    }
    public int perimeter(int l,int w) {
        System.out.println("Perimeter of rectangle : " + l*w);
        return 2*(l+w) ;

    }
}
