public class Author {
    private String name;
    private String surname;
    private String nationality;

    public Author(String name, String surname, String nationality) {
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getNameSurname(){
        return this.surname + " " + this.nationality;
    }

}
