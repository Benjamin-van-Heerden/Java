public class AbstractionDemo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle(1, 2);
        GraphicObject rect = new Rectangle(3, 4);

        circle.draw();
        rect.resize();
    }
}
