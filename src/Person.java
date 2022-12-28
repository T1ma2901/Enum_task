import models.enums.Pl;

public abstract class Person {
    private String fio;
    private int age;
    private String gender;
    private Pl pl;

    public Person() {
    }

    public Person(String fio, int age, String gender, Pl pl) {
        this.fio = fio;
        this.age = age;
        this.gender = gender;
        this.pl = pl;
    }

    public Pl getPl() {
        return pl;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nPerson: " +
                "\nFio: " + fio +
                "\nAge: " + age +
                "\nGender: " + gender +
                "\nPl: " + pl;
    }
}
