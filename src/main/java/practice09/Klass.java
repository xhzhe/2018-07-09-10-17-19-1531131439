package practice09;

import java.util.ArrayList;

public class Klass {
    private Student leader;
    private int number;
    private ArrayList<Student> students = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void assignLeader(Student leader) {
        if (students.isEmpty()) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = leader;
        }
    }

    public void appendMember(Student student) {
        students.add(student);
    }
}
