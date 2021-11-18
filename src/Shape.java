public class Shape {
    public void draw(){
        System.out.println("Draw Shape");
    }
    public void erase(){
        System.out.println("Erase Shape");
    }

    public static void main(String[] args) {
        Shape ss = new Shape();
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();
        ss.draw();
        ss.erase();
        System.out.println("........................................");
        c.draw();
        c.erase();
        System.out.println("........................................");
        t.erase();
        t.draw();
        System.out.println("........................................");
        s.draw();
        s.erase();
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
    @Override
    public void erase(){
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Traingle");
    }
    @Override
    public void erase(){
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Square");
    }
    @Override
    public void erase(){
        System.out.println("Erasing Square");
    }
}