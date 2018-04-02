package login.model;

import java.util.Date;

public class User {

    private String name;
    private Integer age;
    private String secondName;
    private String birthday;


    public User(String name, Integer age, String secondName, String birthday) {
        this.name = name;
        this.age = age;
        this.secondName = secondName;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBirthday() {
        return birthday;
    }
}
