package week1.lesson03.worker;


public class Worker {
    public Worker() {
    }

    public void work1() {
        System.out.println("work1");
    }

    public String toString() {
        return "Worker{}";
    }

    /** @deprecated */
    @Deprecated
    public void work2() {
        System.out.println("work2");
    }

    public void work3() {
        System.out.println("work3");
    }

    public void work4() {
        System.out.println("work4");
    }

    public void work5() {
        System.out.println("work5");
    }
}
