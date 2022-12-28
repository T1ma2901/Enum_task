import models.enums.Payment;
import models.enums.Pl;

public class Student extends Person {
    Payment payment;


    public Student(String fio, int age, String gender, Pl pl, Payment payment) {
        super(fio, age, gender, pl);
        this.payment = payment;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nPayment: " + payment ;
    }
}
