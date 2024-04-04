package ExercicioAdapter;

public class Adaptador {
    // Class body to be added here
    RasterBox ras = new RasterBox();
    int height = ras.getTopLeft().y - ras.getBottomRight().y;
    int width = ras.getTopLeft().x - ras.getBottomRight().x;
    int x = ras.getTopLeft().x;
    int y = ras.getTopLeft().y;
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        System.out.println("Retornando height pelo Adaptador");
        return height;
    }
    public int getX(){
        System.out.println("Retornando x pelo Adaptador");
        return x;
    }
    public int getY(){
        return y;
    }
}
