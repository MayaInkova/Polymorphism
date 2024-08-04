package geometricShapes;

public class Triangle  extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }

    public class Main {
        public static void main(String[] args) {
            Shape[] shapes = {new Circle(), new Rectangle(), new Triangle()};

            for (Shape shape : shapes) {
                shape.draw();  // Извиква съответния метод draw() за всеки обект
            }
        }
    }
}
