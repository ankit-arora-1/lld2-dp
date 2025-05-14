package builder;

public class Student {
    private String name;
    private String phone;
    private int age;
    private String batch;
    private double psp;

    static class Builder {
        private String name;
        private String phone;
        private int age;
        private String batch;
        private double psp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    private Student(Builder builder) {
        if(builder.getAge() > 100) {
            throw new RuntimeException();
        }

        this.name = builder.getName();
        this.phone = builder.getPhone();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
    }

    public static Builder getBuilder() {
        return new Builder();
    }
}
