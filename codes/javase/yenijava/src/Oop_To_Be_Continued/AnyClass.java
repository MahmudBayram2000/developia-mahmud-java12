package Oop_To_Be_Continued;

public class AnyClass {

    public String name;
    public double price;
    public Integer countPage;

    public AnyClass(String name,double price,Integer countPage){

        this.name=name;
        this.price=price;
        this.countPage=countPage;
    }
    @Override
    public String toString(){
        return "AnyClass [name=" + name +",price="+price+",countpage "+countPage+"]";
    }

}
