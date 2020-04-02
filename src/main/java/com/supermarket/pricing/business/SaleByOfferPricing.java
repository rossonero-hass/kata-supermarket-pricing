package com.supermarket.pricing.business;

import com.supermarket.pricing.model.Article;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class SaleByOfferPricing implements IPricing {
    private int nbrBuyedArticle;
    private int nbrOfferedArticle;

    public SaleByOfferPricing(int nbrBuyedArticle, int nbrOfferedArticle) {
        this.nbrBuyedArticle = nbrBuyedArticle;
        this.nbrOfferedArticle = nbrOfferedArticle;
    }

    public BigDecimal calculateTotalPrice(List<Article> articles) {
        if(Objects.isNull(articles) || articles.isEmpty()){
            throw new IllegalArgumentException("la liste des articles ne doit pas être null ou vide");
        }
        BigDecimal total;
        if(articles.size()-nbrBuyedArticle >= 0){
            total = articles.get(0).getPrice().multiply(BigDecimal.valueOf(articles.size()-nbrOfferedArticle)).setScale(2);
        }else{
            return articles.get(0).getPrice().multiply(BigDecimal.valueOf(articles.size())).setScale(2);
        }
        return total;
    }
}
