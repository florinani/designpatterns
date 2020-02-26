package decorator.model2;


public class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void resize() {
        System.out.println("Resizing Circle");
    }

    public String description() {
        return "Circle object";
    }

    public boolean isHide() {
        return false;
    }
}
