package Oop3;

public class Rectangle extends Shape{

    public double width;
    public double height;

    public Rectangle (double width,double height){
        this.width=width;
        this.height=height;
    }
    @Override
    double area(){
        return width*height;
    }
    @Override
    double perimeter(){
        return 2*(width+height);
    }
}
