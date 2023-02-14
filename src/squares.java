public class squares extends ShapeObject
{
    public squares(double width)
    {
        this.width = width;
    }

    public void getArea()
    {
        System.out.println("Square Area: " + (width * width));
    }
}
