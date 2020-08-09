public class Sphere {
    private Float radius;

    public Sphere(Float radius) {
        this.radius = radius;
    }

    public Float getRadius() {
        return radius;
    }

    public double getVolume() {
        // 4/3pi*r^3
        return 4.0/3.0*Math.PI*Math.pow(this.radius, 3);
    }
}
