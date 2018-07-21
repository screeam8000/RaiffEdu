package week0.lesson01.employes;

public class Volantuer extends Employee implements IDressCoder {
    private boolean isStudent;

    public boolean isStudent(){ return isStudent; }

    public void setStudent (boolean student){ isStudent = student; }

    public Volantuer (String department){super(department);}

    @Override
    protected void smoke() {

    }

    public String getDressCodeDescription() {
        return "Someth cheap :(";
    }

    public boolean accessToOfficeByDress(String dressName) {
        return true;
    }

    public void work() {
        System.out.println("Take coffee to BigBoss");
    }
}
