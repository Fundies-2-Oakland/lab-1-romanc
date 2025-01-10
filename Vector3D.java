public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    static double getX(Vector3D v) {
        System.out.print(v.x);
        return v.x;
    }

    static double getY(Vector3D v) {
        System.out.print(v.y);
        return v.y;
    }

    static double getZ(Vector3D v) {
        System.out.print(v.z);
        return v.z;
    }

}
