package laiba;
   
    abstract class Shape{
    	
    	abstract double area();
    }
    
    class Circle extends Shape{
    	double r;
    	Circle(double r){
    		this.r = r;
    	}
    	double area(){
    		return Math.PI*r*r;
    	}
    }
    class rectAngle extends Shape{
    	double l, w;
    	rectAngle(double l, double w){
    		this.l = l;
    		this.w = w;
    	}
    	double area() {
    		return l*w;
    	}
    }
   
public class AbstractClass {

	public static void main (String []args) {
		Shape s1 = new Circle(5);
		Shape s2 = new rectAngle(4, 6);
		System.out.println(s1.area());
		System.out.println(s2.area());
	}
}
