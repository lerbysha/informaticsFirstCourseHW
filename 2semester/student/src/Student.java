import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private String name;
    private boolean male;
    private byte age;

    public Student(String name, boolean male, byte age) {
        this.name = name;
        this.male = male;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return male == student.male &&
                age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, male, age);
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return male;
    }

    public byte getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", male=" + male +
                ", age=" + age +
                '}';
    }
}