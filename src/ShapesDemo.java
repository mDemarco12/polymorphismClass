public class ShapesDemo {

        public static double calculateVolume(Shape shape2d, double height){
            return shape2d.calculateArea() * height;
        }


    public static void main(String[] args) {

        Shape s = new Shape();
        System.out.println("Area of the Shape = " + s.calculateArea());

        Circle circle = new Circle(3.45);
        System.out.println("Area of the shape = " + circle.calculateArea());

        Square square = new Square(3.96);

        System.out.println("Area of the square = " + square.calculateArea());

        Shape c = new Circle(1.3);
                                                        //Will call the calcArea method of child class(circle)
        System.out.println("Area of the circle is: " + c.calculateArea());

        Shape sq = new Square(2.6);
                                                        //Override //Will call from child class
        System.out.println("Area of the square is: " + sq.calculateArea());

        System.out.println("Volume of the Cuboid = " + calculateVolume(sq,1.87));

        System.out.println("Volume of the Cylinder = " + calculateVolume(circle,1.87));

    }



}
