package mongodbexample.model;

import org.springframework.data.mongodb.core.mapping.Document;

//we will not use entity annotation here.Instead we will use Document.
//Because mysql store data in entity(tables) but mongo db store in document
@Document(collection = "students")
public class Student {
    private int id;
    private String name;
    private String city;
    private String college;

    public Student(int id, String name, String city, String college) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
