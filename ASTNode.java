public class ASTNode {
    String name;
    String action;
    String shape;

    public ASTNode(String name, String action, String shape) {
        this.name = name;
        this.action = action;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "ASTNode(Name: " + name + ", Action: " + action + ", Shape: " + shape + ")";
    }
}

