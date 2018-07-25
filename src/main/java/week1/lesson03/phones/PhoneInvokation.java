//package week1.lesson03.phones;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//
//public class PhoneInvokation implements InvocationHandler {
//
//    private Phone phone;
//
//    public PhoneInvokation (Phone phone) {
//        this.phone = phone;
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//         Method method1 = phone.getClass().getDeclaredMethods(method.getName());
//
//        Object result = methods.invoke(phone, args);
//
//        return null;
//    }
//}
