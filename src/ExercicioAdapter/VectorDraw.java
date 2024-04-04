package ExercicioAdapter;

public class VectorDraw {
    //...
    Shape s = new Shape();
    // Obtém instancia de Shape
    int x = s.getX();
    int height = s.getHeight();
    //....
    Adaptador adap = new Adaptador();
    int newX = adap.getX();
    int newY = adap.getY();
    int newHeight = adap.getHeight();
    int newWidth = adap.getWidth();
}
