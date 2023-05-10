package triangle;

import cartesianUtil.CartesianPoint;

public class CartesianTriangle {

    private CartesianPoint vertice_a;
    private CartesianPoint vertice_b;
    private CartesianPoint vertice_c;

    private double angle_a;
    private double angle_b;
    private double angle_c;

    private double ab;
    private double bc;
    private double ac;


    public CartesianTriangle(CartesianPoint A, CartesianPoint B, CartesianPoint C) {

        this.ab = A.distanceTo(B);
        this.bc = B.distanceTo(C);
        this.ac = C.distanceTo(A);

        if (!(ab + bc > ac) || !(bc + ac > ab) || !(ac + ab > bc))
            throw new RuntimeException("This it not a triangle");

        this.vertice_a = A;
        this.vertice_b = B;
        this.vertice_c = C;

        this.angle_a = Math.toDegrees(Math.acos(

                (ac * ac + ab * ab - bc * bc) / (2 * ac * ab)

        ));

        this.angle_b = Math.toDegrees(Math.acos(

                (bc * bc + ab * ab - ac * ac) / (2 * bc * ab)

        ));

        this.angle_c = Math.toDegrees(Math.acos(

                (bc * bc + ac * ac - ab * ab) / (2 * bc * ac)

        ));

    }

    public double semiPerimeter() {
        return (ab + bc + ac) / 2;
    }

    public double area() {
        double p = semiPerimeter();
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }


    public CartesianPoint getVertice_a() {
        return vertice_a;
    }


    public CartesianPoint getVertice_b() {
        return vertice_b;
    }


    public CartesianPoint getVertice_c() {
        return vertice_c;
    }


    public double getAngle_a() {
        return angle_a;
    }


    public double getAngle_b() {
        return angle_b;
    }


    public double getAngle_c() {
        return angle_c;
    }


    public double getAB() {
        return ab;
    }


    public double getBC() {
        return bc;
    }


    public double getAC() {
        return ac;
    }
    

}
