
public class Student {

    private String id;
    private String name;
    private String department;

    public Student() {
    }

    public Student(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', department='" + department + "'}";
    }

    public static void main(String[] args) {
        Student student = new Student("123", "John Doe", "Computer Science");
        System.out.println(student);
        
        student.setName("Jane Doe");
        System.out.println("Updated Name: " + student.getName());
        
        student.setDepartment("Mathematics");
        System.out.println("Updated Department: " + student.getDepartment());
    }
}
