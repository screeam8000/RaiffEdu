package Week1.Lesson01.OOP.Parents;

public class Parent {
    public static int counter = 0;
    public String familyName;
    protected String familySecret;
    private String topSecret;

    Parent(String name){

    }

    public Parent(String familyName, String familySecret, String topSecret){
    this.familyName = familyName;
    this.familySecret = familySecret;
    this.topSecret = topSecret;
    }

    public Parent(String familySecret, String topSecret){
        this.familySecret = familySecret;
        this.topSecret = topSecret;
    }

    public Parent(){

    }

    public void pubMethod(){
        System.out.println(this.topSecret);
        ++counter;
    }

    public static void staticMet (){++counter;}
}
