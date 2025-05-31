package entity;

import java.sql.Date;

public class Purchase {
    int id;
    String category;
    String name;
    String supplier;
    float unitPrice;
    float quantity;
    float totaltPrice;
    Date dateAndTime;

    public Purchase() {
    }

    public Purchase(String category, String name, String supplier, float unitPrice, float quantity, float totaltPrice, Date dateAndTime) {
        this.category = category;
        this.name = name;
        this.supplier = supplier;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totaltPrice = totaltPrice;
        this.dateAndTime = dateAndTime;
    }
    
    public Purchase(int id, String category, String name, String supplier, float unitPrice, float quantity, float totaltPrice, Date dateAndTime) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.supplier = supplier;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totaltPrice = totaltPrice;
        this.dateAndTime = dateAndTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getTotaltPrice() {
        return totaltPrice;
    }

    public void setTotaltPrice(float totaltPrice) {
        this.totaltPrice = totaltPrice;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
    
    
}
