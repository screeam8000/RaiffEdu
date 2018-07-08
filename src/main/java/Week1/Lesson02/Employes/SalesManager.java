package Week1.Lesson02.Employes;

import com.sun.org.apache.xpath.internal.operations.String;

public class SalesManager extends Employee
implements IDressCoder, ISalaryTaker{
    private boolean coldSales;

    public boolean isColdSales(){ return coldSales; }

    public void setColdSales (boolean coldSales){ this.coldSales = coldSales; }

    public SalesManager (String department){super(department);}

    @Override
    protected void smoke() {

    }

    public java.lang.String getDressCodeDescription() {
        return "cool suite!";
    }

    public boolean accessToOfficeByDress(java.lang.String dressName) {
        return true;
    }

    public int getSalaryAmount() {
        return 90000;
    }

    public void work() {
        System.out.println("Sold out!!!");
    }
}
