package prototype;

public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private double psp;
    private double avgPsp;
    private String batchName;

    private int count;

    public Student () {}

    public Student (Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.avgPsp = student.avgPsp;
        this.batchName = student.batchName;
        this.count = student.count;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
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

    public double getAvgPsp() {
        return avgPsp;
    }

    public void setAvgPsp(double avgPsp) {
        this.avgPsp = avgPsp;
    }

    @Override
    public Student clone() {
//        Student copy = new Student();
//        copy.name = this.name;
//        copy.age = this.age;
//        copy.psp = this.psp;
//        copy.batchName = this.batchName;
//        copy.avgPsp = this.avgPsp;
//        copy.count = this.count;

//        return copy;

        return new Student(this);
    }
}
