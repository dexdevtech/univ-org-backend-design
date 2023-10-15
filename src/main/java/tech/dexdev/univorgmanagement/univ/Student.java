package tech.dexdev.univorgmanagement.univ;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "student_table")
public class Student {
    @Id
    private String studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate birthday;
    private String contact;
    private String barangay;
    private String city;
    @Enumerated(EnumType.STRING)
    private Section section;

//    CONSTRUCTORS


    public Student() {
    }

    public Student(String studentId, String firstName, String middleName, String lastName, String email, Gender gender, LocalDate birthday, String contact, String barangay, String city, Section section) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.contact = contact;
        this.barangay = barangay;
        this.city = city;
        this.section = section;
    }

    public Student(String studentId, String firstName, String lastName, Gender gender, LocalDate birthday, String contact, String barangay, String city, Section section) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.contact = contact;
        this.barangay = barangay;
        this.city = city;
        this.section = section;
    }

    public Student(String studentId, String firstName, String middleName, String lastName, Gender gender, LocalDate birthday, String contact, String barangay, String city, Section section) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.contact = contact;
        this.barangay = barangay;
        this.city = city;
        this.section = section;
    }

//    GETTERS

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getContact() {
        return contact;
    }

    public String getBarangay() {
        return barangay;
    }

    public String getCity() {
        return city;
    }

    public Section getSection() {
        return section;
    }

//    SETTERS

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSection(Section section) {
        this.section = section;
    }

//    TOSTRING()

    @Override
    public String toString() {
        return "StudentModel{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", contact='" + contact + '\'' +
                ", barangay='" + barangay + '\'' +
                ", city='" + city + '\'' +
                ", section=" + section +
                '}';
    }
}



