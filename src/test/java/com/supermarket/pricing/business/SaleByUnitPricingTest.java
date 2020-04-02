package com.supermarket.pricing.business;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collections;

public class SaleByUnitPricingTest {

    @Test
    public void priceCalculateByUnit(){
        SaleByUnitPricing saleByUnitPricing = new SaleByUnitPricing();
        BigDecimal total = saleByUnitPricing.calculateTotalPrice(Constant.LIST_ARTICLE_3);
        Assert.assertEquals(BigDecimal.valueOf(1.95), total);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptionMustBeThrown(){
        SaleByUnitPricing saleByUnitPricing = new SaleByUnitPricing();
        saleByUnitPricing.calculateTotalPrice(Collections.emptyList());
    }
}