package polymorphism;

public class Triangle extends Rectangle {


    @Override
    public int area(int l, int w) {
        return super.area(3, 4);
    }

    @Override
    public int perimeter(int l, int w, int v) {
        return super.perimeter(2,4,4);
    }



    public double areat(double c,double b,double h)
    {
        System.out.println("Area of Triangle : "+c * b * h );
        return c * b * h ;
    }
    public  int perimetert(int b,int d,int h)
    {
        int s = b+d+h;
        System.out.println("Perimeter of Triangle: " +s);
        return s ;
    }

    public static void main(String[] args) {



        Triangle obj = new Triangle();

        obj.area(3,6);
        obj.perimeter(2,3,4);
        obj.areac(3.3,2);
        obj.perimeterc(3.3,5,6);
        obj.areat(2,3,5);
        obj.perimetert(5,5,5);


    }

}
