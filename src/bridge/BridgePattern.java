package bridge;

public class BridgePattern {
    interface DrawingAPI {
         void drawCircle(double x, double y, double radius);
    }

    static class DrawingAPI1 implements DrawingAPI {
        public void drawCircle(double x, double y, double radius) {
            System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
        }
    }

    static class DrawingAPI2 implements DrawingAPI {
        public void drawCircle(double x, double y, double radius) {
            System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
        }
    }

    abstract static class Shape {
        protected DrawingAPI drawingAPI;

        protected Shape(DrawingAPI drawingAPI){
            this.drawingAPI = drawingAPI;
        }

        public abstract void draw();
        public abstract void resizeByPercentage(double pct);
    }

    static class CircleShape extends Shape {
        private double x, y, radius;

        public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
            super(drawingAPI);
            this.x = x;  this.y = y;  this.radius = radius;
        }

        public void draw() {
            drawingAPI.drawCircle(x, y, radius);
        }
        public void resizeByPercentage(double pct) {
            radius *= (1.0 + pct/100.0);
        }
    }

    /*
    In this example, the DrawingAPI interface and its two implementations DrawingAPI1 and DrawingAPI2 represent the implementation part.
     The Shape abstract class and its CircleShape implementation represent the abstraction part.

    The Shape class has a field for the DrawingAPI, and the CircleShape class is initialized with a specific DrawingAPI
     implementation, allowing the CircleShape to be rendered using either DrawingAPI1 or DrawingAPI2.

     This separation of abstraction and implementation allows the two parts to vary independently,
     making the overall system more flexible and easy to extend.
     */

    // Main
    public static void main(String[] args){
//        Shape circle = new CircleShape(3, 5, 6, new DrawingAPI2());
//
//        circle.draw();

    }
}
