package practice06;

public class Teacher extends Person {
    private Integer klass;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    protected String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (this.klass == null ? "No Class" : ("Class " + this.klass)) + ".";
    }
}
