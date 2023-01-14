package dmit2015.model;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    //Checked Exception Example
    /*public void setRadius(double radius) throws Exception {
        if (radius < 0)
        {
            throw new Exception("Radius is less than a positive non-zero number");
        }
        this.radius = radius;
    }*/

    // Runtime Exception Example
    public void setRadius(double radius) throws Exception {
        if (radius < 0)
        {
            throw new RuntimeException("Radius is less than a positive non-zero number");
        }
        this.radius = radius;
    }
    public Circle() {
        this.radius= 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area()
    {
        return  Math.PI * radius *radius;
    }

    public double Perimeter ()
    {
        return  2 * Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 =new Circle();
        System.out.printf("The radius of circle1 is %s\n" ,circle1.getRadius());
        System.out.printf("The area of circle1 is %.5f\n",circle1.Area());
        System.out.printf("The perimeter of circle1 is %.2f\n",circle1.Perimeter());


        // try to set the radius to -25
        try
        {
            circle1.setRadius(5);
            System.out.println("*************************************************");
            System.out.println("This is the results after the set has been called");
            System.out.printf("The radius of circle1 is %s\n" ,circle1.getRadius());
            System.out.printf("The area of circle1 is %.5f\n",circle1.Area());
            System.out.printf("The perimeter of circle1 is %.2f\n",circle1.Perimeter());

            circle1.setRadius(-25);
            System.out.println("Exception should have been thrown");
        }
        catch(Exception ex)
        {
            System.out.printf(ex.getMessage());
        }
    }
}
