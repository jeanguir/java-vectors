public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Vector scale(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public double dotProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector crossProduct(Vector other) {
        double newX = this.y * other.z - this.z * other.y;
        double newY = this.z * other.x - this.x * other.z;
        double newZ = this.x * other.y - this.y * other.x;
        return new Vector(newX, newY, newZ);
    }

    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);

        System.out.println("Vector 1: (" + v1.getX() + ", " + v1.getY() + ", " + v1.getZ() + ")");
        System.out.println("Vector 2: (" + v2.getX() + ", " + v2.getY() + ", " + v2.getZ() + ")");

        Vector v3 = v1.add(v2);
        System.out.println("v1 + v2: (" + v3.getX() + ", " + v3.getY() + ", " + v3.getZ() + ")");

        Vector v4 = v1.subtract(v2);
        System.out.println("v1 - v2: (" + v4.getX() + ", " + v4.getY() + ", " + v4.getZ() + ")");

        Vector v5 = v1.scale(2);
        System.out.println("v1 * 2: (" + v5.getX() + ", " + v5.getY() + ", " + v5.getZ() + ")");

        double dot = v1.dotProduct(v2);
        System.out.println("v1 . v2: " + dot);

        Vector v6 = v1.crossProduct(v2);
        System.out.println("v1 x v2: (" + v6.getX() + ", " + v6.getY() + ", " + v6.getZ() + ")");
    }
}
