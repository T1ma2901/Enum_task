import models.enums.Degree;
import models.enums.Pl;

public class Mentor extends Person{
    Degree degree;


    public Mentor(String fio, int age, String gender, Pl pl, Degree degree) {
        super(fio, age, gender, pl);
        this.degree = degree;
    }

    @Override
    public String toString() {
        return      super.toString()+
                "\nDegree: " + degree ;
    }
}
