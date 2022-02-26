public class Character2
{
    public String firstName; 
    public String surname;

    public void setName(String n) {
        String names[] = n.split(" ");
        firstName = names[0];
        surname = names[1];
    }

    public String getName() {
        return (firstName + " " + surname);
    }
};

