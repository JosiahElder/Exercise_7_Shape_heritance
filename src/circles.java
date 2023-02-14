public class circles extends ShapeObject
{
    public circles(double width)
    {
        this.width = width;
    }

    public void getArea()
    {
        System.out.println("Circle Area: " + (3.14 * width * width));
    }
}
