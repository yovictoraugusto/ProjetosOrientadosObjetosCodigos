package ExercicioAdapter;

public class Main {
    public static void main(String[] args) {
        Coords c = new Coords();
        Coords c1 = new Coords();
        c.x = 5;
        c.y = 6;
        c1.x = 15;
        c1.y = 16;

        RasterBox rb = new RasterBox();
        rb.setTopLeft(c);
        rb.setBottomRight(c1);


//        Shape s = new Shape();
//        s.x = 5;
//
//        VectorDraw vd = new VectorDraw();
    }
}
