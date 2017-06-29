package solanki.ankit.Student.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private int user_id;
    @Column(name="name")
    private String user_name;
    @Column(name="age")
    private int user_age;
    
    public int getId() {
        return user_id;
    }
    public void setId(int user_id) {
        this.user_id = user_id;
    }
    public String getName() {
        return user_name;
    }
    public void setName(String user_name) {
        this.user_name = user_name;
    }
    public int getAge() {
        return user_age;
    }
    public void setAge(int user_age) {
        this.user_age = user_age;
    }
}
