package week0.lesson01.employes;

import com.sun.org.apache.xpath.internal.operations.String;

public abstract class Employee implements IHardWorker {
    private final java.lang.String organizationName = "Raiffaeisen";
    protected java.lang.String department;

    public Employee(String department) { this.department=
            organizationName + department;}

    public Employee(java.lang.String department) {

    }

    protected abstract void smoke ();
    }

