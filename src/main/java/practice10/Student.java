package practice10;

public class Student extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    protected String introduce() {
        String introduce = super.introduce() + " I am a Student.";
        if (this.klass != null && this.klass.getLeader() != null && this.klass.getLeader().getId() == this.getId()) {
            introduce += " I am Leader of Class " + this.klass.getNumber() + ".";
        } else {
            assert this.klass != null;
            introduce += " I am at Class " + this.klass.getNumber() + ".";
        }
        return introduce;
    }
}
