package pe.promart.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Client {
    private Long id;
    private String name;
    private String lastName;
    private int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    public Client(Long id, String name, String lastName, int age, Date birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
