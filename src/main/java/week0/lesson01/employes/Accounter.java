package week0.lesson01.employes;

public class Accounter extends Employee implements ITaxPayer {
    public Accounter (String department) {super(department);}

    @Override
    protected void smoke() {

    }

    @Override
    public float getTax(int salary) { return 0;}

    @Override
    public int getSalaryAmount() { return 0;}

    public void work() {
        System.out.println("Create reports"); }
}

