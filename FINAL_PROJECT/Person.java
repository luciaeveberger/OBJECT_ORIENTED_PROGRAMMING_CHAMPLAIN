package FINAL_PROJECT;

public class Person {

    // we can see what data they have !
    public String name;
    public String lastName;

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
    // allow us to print our object
    // let's add more functionality to our base method => we know what your doing!
    // now if we do not override the toString method => #93j1ja9
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
