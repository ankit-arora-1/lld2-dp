package prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private double avgBatchPsp;
    private int count = 0;


    public Student() { }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.avgBatchPsp = student.avgBatchPsp;
        this.batch = student.batch;
        this.count = student.count;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        count++;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

}
