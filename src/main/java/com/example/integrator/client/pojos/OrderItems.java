package com.example.integrator.client.pojos;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderItems {

    private String itemsId;
    private String itemType;
    private Float price;
    private Integer quantity;


    public String getItemsId() {
        return itemsId;
    }

    @XmlElement
    public void setItemsId(String itemsId) {
        this.itemsId = itemsId;
    }

    public String getItemType() {
        return itemType;
    }
    @XmlElement
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Float getPrice() {
        return price;
    }
    @XmlElement
    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @XmlElement
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItems{" +
                "itemsId='" + itemsId + '\'' +
                ", itemType='" + itemType + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
