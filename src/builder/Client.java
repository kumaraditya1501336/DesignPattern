package builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setAge(20);
//        builder.setName("Aditya");
//        builder.setBatch("Mar24");
//        builder.setPsp(20);
//
//        Student student = builder.build();

        Student student1 = Student.getBuilder()
                        .setName("Aditya")
                .setAge(20)
                .setBatch("Mar 2024")
                .build();

        System.out.println("DEBUG");

        Student.Builder builder1 = new Student.Builder();
        
    }
}
