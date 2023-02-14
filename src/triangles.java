public class triangles extends ShapeObject
{
    public triangles(double height , double width)
    {
        this.height = height;
        this.width = width;
    }

    public void getArea()
    {
        System.out.println("Traingle Area: "+ ((height*width) / 2));
    }
}
