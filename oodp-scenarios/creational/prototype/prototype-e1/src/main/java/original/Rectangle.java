package original;

public class Rectangle extends Shape {
    int width;
    int height;
    public Rectangle(int x, int y, int width,int height, String color) {
        super(x, y, color);
        this.width=width;
        this.height=height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        // Draw the rectangle somehow
    }

    @Override
    public void move(int x, int y) {
        setX(getX()+x);
        setY(this.getY()+y);
    }
    
}