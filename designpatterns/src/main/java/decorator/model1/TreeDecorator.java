package decorator.model1;

public abstract class TreeDecorator implements ChristmasTree{

    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree tree) {
        this.christmasTree = tree;
    }

    public String decorate() {
        return christmasTree.decorate();
    }
}
