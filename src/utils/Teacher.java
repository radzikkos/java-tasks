package utils;

public class Teacher extends Person {

    private ScientificTitle scientificTitle;

    public Teacher(String firstname, String lastname, ScientificTitle scientificTitle) {
        super(firstname, lastname);

        this.scientificTitle = scientificTitle;
    }

    @Override
    public String toString() {
        return super.toString() + " My title is " + this.scientificTitle + '.';
    }
}

