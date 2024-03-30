public class Program2 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2.7, "red", true),
                new Circle(3.2, "green", false),
                new Circle(3.8, "blue", true),
                new Circle(4.3, "yellow", true),
                new Rectangle(2.3, 6.2, "blue", true),
                new Rectangle(4.2, 5.5, "red", false),
                new Rectangle(3.4, 6.1, "green", false),
                new Rectangle(2.8, 3.9, "white", true),
                new Square(8.5, "green", true),
                new Square(4.3, "red", false)
        };

        for(Shape s: shapes ){
            System.out.println(s.toString());
        }
    }

}
