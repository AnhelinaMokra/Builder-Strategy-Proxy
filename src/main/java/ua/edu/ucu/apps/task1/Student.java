package ua.edu.ucu.apps.task1;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.Data;

@ToString @Builder @Data
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    @Singular private List<String> courses;

    //Як виглядає білдер |отак|

    // public static class StudentBuilder {
    //     private Student student;

    //     public StudentBuilder() {
    //         student = new Student();
    //     }

    //     public StudentBuilder firstName(String firstName){
    //         student.firstName = firstName; //.firstName доступається бо білдер в середині студента якби нє то не доступився би
    //         return this;
    //     }

    //     public StudentBuilder lastName(String lastName) {
    //         student.lastName = lastName;
    //         return this;
    //     }

    //     public StudentBuilder age(int age) {
    //         student.age = age;
    //         return this;
    //     }

    //     public Student build() {
    //         return student;
    //     }
    // }

    // //анти паттерн
    // public Student setFirstName(String firstName) {
    //     this.firstName = firstName;
    //     return this;
    // }

    // // і хоп хоп ланцюжком забілдити студента
    // public Student setLastName(String lastName) {
    //     this.lastName = lastName;
    //     return this;
    // }
    // //ПОРУШЕННЯ СОЛІД СІНГЛ РЕСПОНСІБІЛТІ !!!


}

