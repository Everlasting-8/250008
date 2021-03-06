package text;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Person {


    public Person(String name, double weight, double height) throws Exception {
        if (weight < 0) throw new Exception("Weight must be more than zero!");
        if (height < 0) throw new Exception("Height must be more than zero!");
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    private double weight;
    private double height;
    private String name;

    public void setWeight(double weight) throws Exception {
        if (weight < 0) throw new Exception("weight must be more than zero!");
        this.weight = weight;
    }

    public void setHeight(double height) throws Exception {
        if (height < 0) throw new Exception("height must be more than zero!");
        this.height = height;
    }

}
