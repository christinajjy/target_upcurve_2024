public class Square extends Rectangle{
    Square(){}
    Square(double side){
        super(side,side);
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public String toString(){
        return "Square[side="+super.getWidth()+","+super.toString()+"]";
    }
}
