package practice05;

import practice04.Person;

public class Student extends Person {
    private int klass;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    protected String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
    }
}
