package ExercicioAdapter;

public class RasterBox {
    private Coords topLeft, bottomRight;

    public void setTopLeft(Coords topLeft) {
        this.topLeft = topLeft;
    }

    public RasterBox() {

    }

    public void setBottomRight(Coords bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Coords getTopLeft() {
        return topLeft;
    }
    public Coords getBottomRight() {
        return bottomRight;
    }
}
