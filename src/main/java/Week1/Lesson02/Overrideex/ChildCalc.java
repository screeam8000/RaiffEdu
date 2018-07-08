package Week1.Lesson02.Overrideex;

public class ChildCalc extends ParentCalc {
    @Override
    public ChildValue calcValue(ParentValue parentValue) {
        return new ChildValue();
    }
}
