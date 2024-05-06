package builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = Student.getBuilder();
        builder.setAge(20);
        builder.setName("Aditya");
        builder.setBatch("Mar24");
        builder.setPsp(20);

        Student student = new Student(builder);

        System.out.println("DEBUG");
    }
}
