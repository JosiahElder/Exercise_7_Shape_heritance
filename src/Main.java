public class Main
{
    public static void main(String[] args)
    {
        triangles T = new triangles(10.0,10.0);
        squares S = new squares(10.0);
        circles C = new circles(10.0);
        T.getArea();
        S.getArea();
        C.getArea();
    }
}