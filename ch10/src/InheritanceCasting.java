import javafx.scene.Parent;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting casting = new InheritanceCasting();
        casting.callPrintNames();
    }

    public void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting) parent;
    }

    public void objectCast2() {
        ChildCasting child = new ChildCasting();
        ParentCasting parent = child;
        ChildCasting child2 = (ChildCasting) parent;
    }

    public void callPrintNames() {
        ParentCasting parent1 = new ParentCasting();
        ParentCasting parent2 = new ChildCasting();
        ParentCasting parent3 = new ChildOther();

        parent1.printName();
        parent2.printName();
        parent3.printName();
    }
}
