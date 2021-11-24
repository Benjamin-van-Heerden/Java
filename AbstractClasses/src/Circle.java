public class Circle extends GraphicObject {
    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    void resize() {
        System.out.println("Resize the circle");
    }
}
