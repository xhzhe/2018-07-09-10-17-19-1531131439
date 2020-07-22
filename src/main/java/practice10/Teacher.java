package practice10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getKlass() {
        return classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    protected String introduce() {
        if (this.classes == null || this.classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            ArrayList<String> classCount = new ArrayList<>();
            for (Klass klass : classes) {
                classCount.add(String.valueOf(klass.getNumber()));
            }
            return super.introduce() + " I am a Teacher. I teach Class " + String.join(", ", classCount) + ".";
        }
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : this.classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    protected String introduceWith(Student student) {
        String introduceWith = super.introduce() + " I am a Teacher.";
        if (isTeaching(student)) {
            return introduceWith + " I teach " + student.getName() + ".";
        }
        return introduceWith + " I don't teach " + student.getName() + ".";
    }
}
