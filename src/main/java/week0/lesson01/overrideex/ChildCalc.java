package week0.lesson01.overrideex;

public class ChildCalc extends ParentCalc {
    @Override
    public ChildValue calcValue(ParentValue parentValue) {
        return new ChildValue();
    }
}
