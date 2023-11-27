package oopd_gu_chalmers.polygons.polygon;

public class PolygonFactory {
    public static Polygon createRectangle(int x, int y) {
        Polygon rectangle = new Rectangle(x, y);
        return rectangle;
    }
    public static Polygon createSquare(int x, int y) {
        Polygon square = new Square(x, y);
        return square;
    }
    public static Polygon createTriangle(int x, int y) {
        Polygon triangle = new Triangle(x, y);
        return triangle;
    }
}
//  1c: Why should this class reside inside the
//  oopd_gu_chalmers.polygons.polygon subpackage, and not in
//  oopd_gu_chalmers.polygons together with DrawPolygons?

// high cohesion low coupling, it should be strong dependencies within the package and weak dependencies outside
// also polygon factory is more related to the polygon classes rather than with drawPolygons

// TODO: 1d: Draw a UML class diagram over the new
//  structure for the package. What is the public
//  interface to the polygon subpackage now?

// TODO: 1h: Can you see any drawbacks with introducing
//  a PolygonFactory, instead of exposing the subclasses
//  directly?