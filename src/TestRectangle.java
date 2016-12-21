
        import java.lang.*;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.0, 4.0, "yellow");
        System.out.println("Lenght is " + r1.getLenght()
                + " Width is " + r1.getWidth()
                + " Color is " + r1.getColor()
                + " Area is " + r1.getArea());
        Rectangle r2 = new Rectangle(2.0, 4.0);
        System.out.println("Lenght is " + r2.getLenght()
                + " Width is " + r2.getWidth()
                + " Color is " + r2.getColor()
                + " Area is " + r2.getArea());
        Rectangle r3= new Rectangle();
        System.out.println("Lenght is " + r3.getLenght()
                + " Width is " + r3.getWidth()
                + " Color is " + r3.getColor()
                + " Area is " + r3.getArea());
    }
}

