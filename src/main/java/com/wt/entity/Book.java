package com.wt.entity;

/**
 * Created by Administrator on 2017/11/21.
 */
public class Book {
    private String description;
    private Integer id;
    private String name;
    private String pic ;
    private float price;

    @Override
    public String toString() {
        return "Book{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", pic='" + pic + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
