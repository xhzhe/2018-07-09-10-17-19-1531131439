package practice10;

import java.util.ArrayList;
import java.util.Objects;

public class Klass {
    private Student leader;
    private int number;

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
        if (!leader.getKlass().equals(this)) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = leader;
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
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
}
