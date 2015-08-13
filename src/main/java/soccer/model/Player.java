package soccer.model;
/**
 * Created by clementearismendi on 2015-08-10.
 */
public class Player {

        private String username;
        private String lastname;
        private int age;
        private double salary;
        private String position;
        private String country;

    public Player(String username, String lastname, int age, double salary, String position, String country) {
        this.username = username;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.country = country;
    }

    public Player() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
