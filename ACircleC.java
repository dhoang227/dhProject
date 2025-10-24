public class ACircleC {
    private double radius;

    public ACircleC() {
    }

    public ACircleC(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    public static void main(String[] args){
        ACircleC c1 = new ACircleC(1.1);
        System.out.println(c1);
        ACircleC c2 = new ACircleC();
        System.out.println(c2);

        //Test setter and getter

        c1.setRadius(2.2);
        System.out.println(c1);

        System.out.println("Radius is: " + c1.getRadius()); 

         System.out.printf("area is: %.2f%n", c1.getArea());
      System.out.printf("circumference is: %.2f%n", c1.getCircumference());

    }

}
