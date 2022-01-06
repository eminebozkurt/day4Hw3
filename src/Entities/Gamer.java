package Entities;

public class Gamer {
    public int id;
    public String firstName;
    public String lastName;
    public int dateOfBirth;
    public String nationalityId;

    public Gamer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

}
