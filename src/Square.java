public class Square extends Shape{

    private double length;

    public Square(){
        this(0.0);
    }
    public Square(double length){

        super();
        setLength(length);
    }
    public void setLength(double length){

        if(length >=0 ){
            this.length = length;
        }else{
            System.out.println("error");
            System.exit(0);
        }
    }

    public double getLength(){
        return length;
    }

    //Overode the parent class!
    public double calculateArea(){

        return getLength() * getLength();
    }
}
