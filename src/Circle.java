public class Circle extends Shape {

    private double radius;

    public Circle(){

        super();
       setRadius(0);
    }

    public Circle(double radius){
        super();
        setRadius(radius);

    }

    public void setRadius(double radius){

        if(radius >= 0){
            this.radius = radius;

        }else{
            System.out.println("Error... It's a neg radius");
            System.exit(0);
        }
    }

    public double getRadius(){return radius;}

    //Overrides the method in Shapes***
    public double calculateArea() {

        return (Math.PI * getRadius() * getRadius());
    }




}
