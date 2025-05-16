package prototype;

public class Client {
    public static void populateRegistry(StudentRegistry studentRegistry) {
        Student may23Student = new Student();
        may23Student.setBatch("may23");
        may23Student.setAvgBatchPsp(50.0);

        studentRegistry
                .register("may23Prototype", may23Student);

        IntelligentStudent apr23Student = new IntelligentStudent();
        apr23Student.setBatch("apr23");
        apr23Student.setAvgBatchPsp(85.0);

        studentRegistry
                .register("apr23ISPrototype", apr23Student);


    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        populateRegistry(studentRegistry);

        Student shrihari = studentRegistry
                .get("may23Prototype").clone();
        shrihari.setAge(21);
        shrihari.setName("Shrihari");
        shrihari.setPsp(100.0);

         Student is = studentRegistry
                .get("apr23ISPrototype").clone();

         is.setName("Pranav");
         is.setAge(21);
         is.setPsp(100.0);

        System.out.println("DEBUG");

    }
}
