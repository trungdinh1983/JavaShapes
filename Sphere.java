// Sphere.java
public class Sphere extends Shape {
  private double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  @Override
  public double surface_area() {
    return 4 * Math.PI * radius * radius;
  }

  @Override
  public double volume() {
    return (4.0 / 3.0) * Math.PI * radius * radius * radius;
  }

  @Override
  public String toString() {
    return String.format("Sphere [radius=%.2f, surface area=%.2f, volume=%.2f]",
        radius, surface_area(), volume());
  }

}
