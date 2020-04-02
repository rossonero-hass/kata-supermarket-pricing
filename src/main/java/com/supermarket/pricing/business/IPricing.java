package com.supermarket.pricing.business;

import com.supermarket.pricing.model.Article;

import java.math.BigDecimal;
import java.util.List;

public interface IPricing {
    BigDecimal calculateTotalPrice(List<Article> articles);
}
