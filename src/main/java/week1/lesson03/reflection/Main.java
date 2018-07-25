//package week1.lesson03.reflection;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.lang.reflect.Parameter;
//
//public class Main {
//    public Main() {
//    }
//
//    public static void main(String[] args) {
//        Class parentClass = Parent.class;
//        Child child = new Child();
//        Class childClass = child.getClass();
//        System.out.println(parentClass.getName());
//        System.out.println(parentClass.getCanonicalName());
//        Field[] var4 = childClass.getFields();
//        int var5 = var4.length;
//
//        int var6;
//        Field field;
//        for(var6 = 0; var6 < var5; ++var6) {
//            field = var4[var6];
//            System.out.print(field.getType());
//            System.out.println(" ");
//            System.out.print(field.getName());
//            System.out.println(" ");
//            System.out.print(field.getModifiers());
//            System.out.println();
//        }
//
//        System.out.println("____________________");
//        var4 = childClass.getDeclaredFields();
//        var5 = var4.length;
//
////        for(var6 = 0; var6 < var5; ++var6) {
////            field = var4[var6];
////            System.out.print(field.getType());
////            System.out.println(" ");
////            System.out.print(field.getName());
////            System.out.println(" ");
////            System.out.print(field.getModifiers());
////            System.out.println();
////        }
//
//        System.out.println("_____________");
//        Method[] var16 = childClass.getMethods();
//        var5 = var16.length;
//
//        Parameter[] var8;
//        int var9;
//        int var10;
//        Parameter parameter;
//        Method method;
//        for(var6 = 0; var6 < var5; ++var6) {
//            method = var16[var6];
//            System.out.print(method.getReturnType());
//            System.out.print(" ");
//            System.out.println(method.getName());
//            System.out.println(" ");
//            var8 = method.getParameters();
//            var9 = var8.length;
//
//            for(var10 = 0; var10 < var9; ++var10) {
//                parameter = var8[var10];
//                System.out.print(parameter.getName());
//                System.out.print(" ");
//                System.out.print(parameter.getType());
//                System.out.print(" ");
//                System.out.print(parameter.getModifiers());
//            }
//        }
//
//        var16 = childClass.getDeclaredMethods();
//        var5 = var16.length;
//
////        for(var6 = 0; var6 < var5; ++var6) {
////            method = var16[var6];
////            System.out.print(method.getReturnType());
////            System.out.print(" ");
////            System.out.println(method.getName());
////            System.out.println(" ");
////            var8 = method.getParameters();
////            var9 = var8.length;
//
////            for(var10 = 0; var10 < var9; ++var10) {
////                parameter = var8[var10];
////                System.out.print(parameter.getName());
////                System.out.print(" ");
////                System.out.print(parameter.getType());
////                System.out.print(" ");
////                System.out.print(parameter.getModifiers());
////            }
////        }
//
//        Class[] var17 = childClass.getInterfaces();
//        var5 = var17.length;
//
//        for(var6 = 0; var6 < var5; ++var6) {
//            Class inter = var17[var6];
//            Method[] var20 = inter.getDeclaredMethods();
//            var9 = var20.length;
//
//            for(var10 = 0; var10 < var9; ++var10) {
//                Method method = var20[var10];
//                System.out.print(method.getReturnType());
//                System.out.print(" ");
//                System.out.println(method.getName());
//                System.out.println(" ");
//                Parameter[] var12 = method.getParameters();
//                int var13 = var12.length;
//
//                for(int var14 = 0; var14 < var13; ++var14) {
//                    Parameter parameter = var12[var14];
//                    System.out.print(parameter.getName());
//                    System.out.print(" ");
//                    System.out.print(parameter.getType());
//                    System.out.print(" ");
//                    System.out.print(parameter.getModifiers());
//                }
//            }
//        }
//
//    }
//}
