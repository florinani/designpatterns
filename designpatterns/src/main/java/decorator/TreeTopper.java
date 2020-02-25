package decorator;

public class TreeTopper extends TreeDecorator {

    public TreeTopper(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Tree Topper";
    }
}
