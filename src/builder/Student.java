package builder;

public class Student {
    private String name;
    private String batch;
    private double psp;
    private int age;
    private int gradYear;
    private String phone;

    public Student (Builder builder) {
        if (builder.getAge() > 100) {
            throw new RuntimeException();
        }

        this.age = builder.getAge();
        this.name = builder.getName();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.gradYear = builder.getGradYear();
        this.phone = builder.getPhone();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Builder getBuilder() {
        return new Builder();
    }
}
