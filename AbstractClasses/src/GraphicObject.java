abstract public class GraphicObject {
    int x, y;

    // can have a constructor (this is odd, but is available nonetheless)
    // this still does not mean that GraphicObject can be instantiated
    public GraphicObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // normal methods
    void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // and abstract methods
    abstract void draw();

    abstract void resize();
}
