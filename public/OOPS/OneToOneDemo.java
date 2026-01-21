import java.util.Scanner;

class Person {
    int id;
    String name;
    Passport pass;

    Person(int id, String name, Passport p) {
        this.id = id;
        this.name = name;
        this.pass = p;
    }
}

class Passport {
    int passport;
    String nationality;

    Passport(int passport, String nationality) {
        this.passport = passport;
        this.nationality = nationality;
    }

}

public class OneToOneDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Passport p;
        Person m[];
        int n;
        n = 3;
        m = new Person[n];
        for (int i = 0; i < n; i++) {

        }
    }
}
