package Lesson04.Phones;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Phone phone = new SmartPhone();
        phone.questionAnswer("Hi!");

        Phone phoneProxy = Proxy.newProxyInstance(SmartPhone.class.getClassLoader(),
                SmartPhone.class.getInterfaces(),
                new PhoneInvokation(phone));

        phoneProxy.questionAnswer("Secret message...");
    }
}
