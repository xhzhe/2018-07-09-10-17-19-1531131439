package practice11;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Student leader;
    private int number;
    private final List<JoinListener> teachers;

    public Klass(int number) {
        this.number = number;
        this.teachers = new ArrayList<>();
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
        if (!leader.getKlass().equals(this)) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = leader;
            this.teachers.forEach(teacher -> {
                teacher.studentBecomeLeader(leader);
            });
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        this.teachers.forEach(teacher -> {
            teacher.studentJoin(student);
        });
    }

    public boolean isIn(Student student) {
        return student.getKlass().equals(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    protected void register(JoinListener teacher) {
        this.teachers.add(teacher);
    }
}
