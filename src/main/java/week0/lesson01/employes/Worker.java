package week0.lesson01.employes;

public class Worker extends Employee implements ISalaryTaker{
    private int strength;

    public int getStrength(){return strength;}

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Worker(String department){super(department);}

    @Override
    protected void smoke() {

    }

    public int getSalaryAmount() {
        return 50000;
    }

    public void work() {

    }
}
