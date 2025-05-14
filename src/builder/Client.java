package builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.setName("Rahul");
//        builder.setAge(21);
//
//        Student student = new Student(builder);

//       Builder builder = Student.builder();
//       builder.setName("Suresh");
//       builder.setAge(21);
//
//       Student student = new Student(builder);


        Student student1 = Student
                .getBuilder()
                .setName("asda")
                .setAge(21)
                .setBatch("Asdas")
                .build();


        System.out.println("DEBUG");

    }
}
