/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevision;

/**
 *
 * @author HusseinATejan
 */
public abstract class Product {
      public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
    public String title= "";
    public double price=0;
    public int copies=0;

    public Product(String name, double cost, int qty) {
        title=name;
        price=cost;
        copies=qty;
    }
}
