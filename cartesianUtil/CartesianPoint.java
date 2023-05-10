package cartesianUtil;
public class CartesianPoint {

    private double x;
    private double y;

    public CartesianPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static CartesianPoint of(double[] coordinates) {
        if (coordinates.length > 2)
            throw new RuntimeException("This is not a valir ordered pair");
        return new CartesianPoint(coordinates[0], coordinates[1]);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;

    }

    public double distanceTo(CartesianPoint other) {
        return CartesianPlane.distance(this, other);
    }

    public double distanceToOrigin() {
        return CartesianPlane.distance(this, new CartesianPoint(0,0));
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }

}
