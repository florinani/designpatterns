package decorator;

public class Tinsel extends TreeDecorator {

    public Tinsel(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Tinsel";
    }
}

