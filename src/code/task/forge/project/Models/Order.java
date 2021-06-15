package code.task.forge.project.Models;

import java.util.ArrayList;

public class Order {

    private int documentNumber;

    private Client client;

    private Address purchaseAddress;

    private Address deliveryAddress;

    private String date;

    private String state;

    private float descount;

    private float total;

    private ArrayList<Line> lines;


    public Order() {
    }

    public Order(int documentNumber, Client client, Address purchaseAddress, Address deliveryAddress, String date, String state, float descount, float total, ArrayList<Line> lines) {
        this.documentNumber = documentNumber;
        this.client = client;
        this.purchaseAddress = purchaseAddress;
        this.deliveryAddress = deliveryAddress;
        this.date = date;
        this.state = state;
        this.descount = descount;
        this.total = total;
        this.lines = lines;
    }


    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Address getPurchaseAddress() {
        return purchaseAddress;
    }

    public void setPurchaseAddress(Address purchaseAddress) {
        this.purchaseAddress = purchaseAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getDescount() {
        return descount;
    }

    public void setDescount(float descount) {
        this.descount = descount;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }
}
