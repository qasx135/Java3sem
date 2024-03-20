package LAB8.Visitor;

interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}


interface Element {
    void accept(Visitor visitor);
}

// Конкретные элементы
class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}


class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visit ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visit ConcreteElementB");
    }
}


public class VisitorPatternExample {
    public static void main(String[] args) {
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();

        Visitor visitor = new ConcreteVisitor();

        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
