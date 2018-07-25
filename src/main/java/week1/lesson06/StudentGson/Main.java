//package week1.lesson06.StudentGson;
//
//public class Main {
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.age = 28;
//        student.name = "Artem";
//
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//        String fromStudentJSON = gson.toJson(student);
//
//        System.out.println(fromStudentJSON);
//
//       Student studentNew = gson.fromJson(fromStudentJSON, Student.class);
//
//        System.out.println(studentNew);
//    }
//}
