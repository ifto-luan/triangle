package cartesianUtil;
public class CartesianPlane {

    public static double distance(CartesianPoint p1, CartesianPoint p2) {

        return Math.sqrt(Math.pow((p2.getY() - p1.getY()), 2) + Math.pow((p2.getX() - p1.getX()), 2));

    }
    
}
