package ExercicioAdapter;

public class Shape {
    protected int x, y, height, width;
    public int getX() {
        System.out.println("Retornando x pelo Shape");
        System.out.println(x);
        return x;
    }
    public int getY() { return y; }
    public int getHeight() {
        System.out.println("Retornando height pelo Shape");
        System.out.println(height);
        return height;
    }
    public int getWidth() { return width; }
}
