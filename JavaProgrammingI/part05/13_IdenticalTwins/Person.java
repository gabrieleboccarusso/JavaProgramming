import java.util.Objects;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared) {
        boolean flag = false;
        if (this == compared) {
            flag = true;
        } else if(compared instanceof Person) {
            Person comparedPerson = (Person) compared;
            
            flag = this.name.equals(comparedPerson.name) &&
                    this.birthday.equals(comparedPerson.birthday) &&
                    this.height == comparedPerson.height &&
                    this.weight == comparedPerson.weight;
        }
        
        return flag;
    }
}
