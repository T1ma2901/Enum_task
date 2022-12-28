import models.enums.Degree;
import models.enums.Payment;
import models.enums.Pl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mentor ment = new Mentor("Zlatan Ibrahimovic", 35, "Male", Pl.JAVA, Degree.SENIOR);
        Mentor ment1 = new Mentor("Alina Karpova ", 29, "Female", Pl.PYTHON, Degree.MIDDLE);
        Mentor ment2 = new Mentor("Tima Kaparov", 28, "Male", Pl.JAVA, Degree.SENIOR);

        Student student = new Student("Diana Abramova", 22, "Female", Pl.FLUTTER, Payment.FREE);
        Student student1 = new Student("Alex Morgan", 25, "Male", Pl.JAVASCRIPT, Payment.PAYED);
        Student student2 = new Student("Sofia Kim", 18, "Female", Pl.PYTHON, Payment.HALFPAYED);

        System.out.println("Enum: " + Pl.JAVA.name());
        System.out.println("Ordinal: " + Pl.JAVA.ordinal());

        Pl[] pls = Pl.values();
        System.out.println("Enum Pl: " + Arrays.toString(pls));

        Payment[] payment = Payment.values();
        System.out.println("Enum Payment: " + Arrays.toString(payment));

        Degree[] degrees = Degree.values();
        System.out.println("Enum Degree: " + Arrays.toString(degrees));

        Person[] persons = new Person[]{ment, ment1, ment2, student, student1, student2};
        for (Person ps : persons) {
            System.out.println(ps);
        }

    }
}
//Создаем абстракный класс Person и дочерние классы - Student, Mentor
//Person -> FIO, (enum)pl, age, gender
//
//pl->Java,Python,JavaScript,Flutter
//
//Student -> (enum)payment -> FREE, PAYED, HALFPAYED, NOTPAYED, DELETED
//
//Mentor  -> enum(degree) ->  intern, junior, middle, senior
//
//
//В классе Main реализовать методы enum: name(), ordinal(), values().
//
//Создать по 3 экземпляра Student и Mentor и вывести на консоль
//информацию о них.