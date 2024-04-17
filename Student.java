package tools;

public class Student {
    private String name;
    private String subjects;
    private double marks;
    public String uniName = "Kateb University";

    public Student(String Name, String Subject, double Marks) {
        this.name=Name;
        this.subjects=Subject;
        this.marks=Marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;}
    public String getSubjects() {
        return subjects;
    }
    public double getMarks() {
        return marks;
    }
    public String getUniName() {
        return uniName;
    }
}



