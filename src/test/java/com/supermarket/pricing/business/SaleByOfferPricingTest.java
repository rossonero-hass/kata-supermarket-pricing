package com.supermarket.pricing.business;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collections;

public class SaleByOfferPricingTest{
    @Test
    public void priceMustIncludeOfferArticleWhenBuyThreeArticle(){
        SaleByOfferPricing saleByOfferPricing = new SaleByOfferPricing(3,1);
        BigDecimal total = saleByOfferPricing.calculateTotalPrice(Constant.LIST_ARTICLE_3);
        Assert.assertEquals(BigDecimal.valueOf(1.30).setScale(2), total);
    }

    @Test
    public void priceMustIncludeOfferArticleWhenBuyMoreThanThreeArticle(){
        SaleByOfferPricing saleByOfferPricing = new SaleByOfferPricing(4,1);
        BigDecimal total = saleByOfferPricing.calculateTotalPrice(Constant.LIST_ARTICLE_4);
        Assert.assertEquals(BigDecimal.valueOf(1.95).setScale(2), total);
    }

    @Test
    public void priceMustApplicateOfferTwice(){
        SaleByOfferPricing saleByOfferPricing = new SaleByOfferPricing(6,2);
        BigDecimal total = saleByOfferPricing.calculateTotalPrice(Constant.LIST_ARTICLE_6);
        Assert.assertEquals(BigDecimal.valueOf(2.60).setScale(2), total);
    }

    @Test
    public void priceMustDiscaredOfferWhenNbrArticleLessThanNbrBuyedArticle(){
        SaleByOfferPricing saleByOfferPricing = new SaleByOfferPricing(3,1);
        BigDecimal total = saleByOfferPricing.calculateTotalPrice(Constant.LIST_ARTICLE_2);
        Assert.assertEquals(BigDecimal.valueOf(1.30).setScale(2), total);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptionMustBeThrown(){
        SaleByOfferPricing saleByOfferPricing = new SaleByOfferPricing(3,1);
        saleByOfferPricing.calculateTotalPrice(Collections.emptyList());
    }
}