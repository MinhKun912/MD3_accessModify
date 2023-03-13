package Student;

public class Student {
    private String name = "Jone";
    private String classess = "C02";

    public String setName(String name) {
        return this.name = name;
    }

    public String setClass(String classess) {
        return this.classess = classess;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classess='" + classess + '\'' +
                '}';
    }
}
