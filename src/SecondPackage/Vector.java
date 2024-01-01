package SecondPackage;

public class Vector {
    private double x;
    private double y;
    private double z;
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector() {
        this(0.0, 0.0, 0.0);
    }
    public static Vector plus(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }
    public static Vector minus(Vector v1, Vector v2) {
        return new Vector(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    private double angle(Vector v1) {
        double numerator = v1.x * x + v1.y * y + v1.z * z;
        return numerator / (module() * v1.module());
    }
    public double module() {
        return Math.sqrt(x * x  + y * y + z * z);
    }
    public double scalar(Vector v1) {
        return module() *  v1.module() * angle(v1);
    }
    public void multiply(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }
    public boolean compare(Vector v1) {
        return(this.x == v1.x && this.y == v1.y && this.z == v1.z);
    }
}
