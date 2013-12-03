/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.research.java8;


import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 *
 * @author wayne
 */
public class Person {

    static List<Person> createRoster() {
        List<Person> result = new ArrayList<>();
        result.add(new Person("Wayne", new LocalDate(1981, 9, 4), Sex.MALE, "wayne@test.com"));
        result.add(new Person("Francine", new LocalDate(1981, 8, 28), Sex.FEMALE, "francine@test.com"));
        result.add(new Person("Selena", new LocalDate(2001, 7, 1), Sex.FEMALE, "selena@test.com"));
        result.add(new Person("GI Joe", new LocalDate(1993, 1, 1), Sex.MALE, "gijoe@goarmy.com"));
        
        return result;
    }


    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthdate = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    Sex getGender() {
        return this.gender;
    }
    
    String getEmailAddress() {
        return this.emailAddress;
    }
 
    public enum Sex {

        MALE, FEMALE
    }

    String name;
    LocalDate birthdate;
    Sex gender;
    String emailAddress;

    public int getAge() {
        LocalDate now = new LocalDate();
        Years age = Years.yearsBetween(birthdate, now);
        
        return age.getYears();
    }

    public void printPerson() {
        System.out.println("### printPerson: " + this.toString());
    }

    @Override
    public String toString() {
        return String.format(name, getAge(), birthdate, emailAddress, gender, name);
    }

}
