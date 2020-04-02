package com.supermarket.pricing.business;

import com.supermarket.pricing.model.Article;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class SaleByUnitPricing implements IPricing {
    public BigDecimal calculateTotalPrice(List<Article> articles) {
        if(Objects.isNull(articles) || articles.isEmpty()){
            throw new IllegalArgumentException("la liste des articles ne doit pas être null ou vide");
        }
        BigDecimal total = articles.get(0).getPrice().multiply(BigDecimal.valueOf(articles.size()));
        return total;
    }
}
