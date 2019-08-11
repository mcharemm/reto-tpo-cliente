package pe.promart.model;

import com.github.fabiomaffioletti.firebase.document.FirebaseDocument;
import com.github.fabiomaffioletti.firebase.document.FirebaseId;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Date;

@FirebaseDocument("/clients")
@Entity
public class Client implements Serializable {

    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO = Charset.forName("ISO-8859-1");

    private static final long serialVersionUID = 1L;
    @FirebaseId
    @Id
    private String id;
    private String name;
    private String lastName;
    private int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    public Client() {
    }

    public Client(String id, String name, String lastName, int age, Date birthDate) {
        String formattedName = new String(name.getBytes(ISO), UTF_8);
        String formattedLastName = new String(lastName.getBytes(ISO), UTF_8);
        this.id = id;
        this.name = formattedName;
        this.lastName = formattedLastName;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
