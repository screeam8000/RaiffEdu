package Week1.Lesson02.Employes;

public class Boss extends Employee implements IDressCoder, ISalaryTaker {
    private String ambititons;

    public String getAmbititons(){ return ambititons; }

    public void setAmbititons(String ambititons) {
        this.ambititons = ambititons; }

        public Boss (String department) {super(department);}

    @Override
    protected void smoke(){

    }

    @Override
    public String getDressCodeDescription(){return "cool jaket!";}

    @Override
    public boolean accessToOfficeByDress (String dressName)
    { return true; }

    @Override
    public int getSalaryAmount() { return 1500000; }

    @Override
    public void work() {
        System.out.println("Make dessicions");
    }
}
