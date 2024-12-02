public class ASTBuilder extends DSLBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitStatement(DSLParser.StatementContext ctx) {
        String name = ctx.NAME().getText();
        String action = ctx.ACTION().getText();
        String shape = ctx.SHAPE().getText();
        return new ASTNode(name, action, shape);
    }
}
