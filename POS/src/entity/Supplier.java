package entity;

public class Supplier {
    private int id;
    private String name;
    private String email;
    private String cell;
    private String contactPerson;

    public Supplier() {
    }

    public Supplier(int id, String name, String email, String cell, String contactPerson) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cell = cell;
        this.contactPerson = contactPerson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
    
    
}
