package week05.BankDemo;

public class Customer {
    private int ID;
    private String name;
    private String gender;

    public Customer(int ID, String name, String gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + ID + ")";
    }
}
