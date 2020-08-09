package oops.library;

import java.time.LocalDate;
import java.time.Period;

public class Author {
    public String name;
    public String email;
    public LocalDate birthday;
    public int age;

    public Author(String name, String email, String birthday) {
        this.name = name;
        this.email = email;
        this.birthday = LocalDate.parse(birthday);
        this.age = Period.between(this.birthday, LocalDate.now()).getYears();
    }

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = LocalDate.parse(birthday);
        this.age = Period.between(this.birthday, LocalDate.now()).getYears();
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        age = Period.between(birthday, today).getYears();
        return age;
    }
}
