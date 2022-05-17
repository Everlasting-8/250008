package text;

public class Creature {
    private String name;

    private String hypnotiseOf;

    public Creature(String name) {
        this.name = name;
    }

    public void hypnotise(Person person){
        hypnotiseOf = person.getName();
    }

    public String getHypnotiseOf(){
        return hypnotiseOf;
    }
}
