package Humans;

public class Human {

    String firstName;
    String lastName;
    String patronymic;
    String gender;
    String birthdayData;
    String nationality;

    public Human(String firstName, String lastName, String patronymic, String gender, String birthdayData, String nationality) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthdayData = birthdayData;
        this.gender = gender;
        this.nationality = nationality;
    }
    public Human(){

    }
}
