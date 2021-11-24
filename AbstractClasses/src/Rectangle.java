public class Rectangle extends GraphicObject {
    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    void resize() {
        System.out.println("Resize Rectangle");
    }
}
