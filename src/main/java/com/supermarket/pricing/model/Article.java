package com.supermarket.pricing.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Article {
    private String name;
    private BigDecimal price;

    public Article(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Article() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
