package com.supermarket.pricing.business;

import com.supermarket.pricing.model.Article;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Constant {
    public static List<Article> LIST_ARTICLE_3;
    public static List<Article> LIST_ARTICLE_2;
    public static List<Article> LIST_ARTICLE_4;
    public static List<Article> LIST_ARTICLE_6;
    static{
        LIST_ARTICLE_2 = Arrays.asList(new Article("can of beans", BigDecimal.valueOf(0.65)),new Article("can of beans", BigDecimal.valueOf(0.65)));
        LIST_ARTICLE_3 = Arrays.asList(new Article("can of beans", BigDecimal.valueOf(0.65)),new Article("can of beans", BigDecimal.valueOf(0.65))
        ,new Article("can of beans", BigDecimal.valueOf(0.65)));
        LIST_ARTICLE_4 = Arrays.asList(new Article("can of beans", BigDecimal.valueOf(0.65)),new Article("can of beans", BigDecimal.valueOf(0.65))
                ,new Article("can of beans", BigDecimal.valueOf(0.65)),new Article("can of beans", BigDecimal.valueOf(0.65)));
        LIST_ARTICLE_6 = Arrays.asList(new Article("can of beans", BigDecimal.valueOf(0.65)),new Article("can of beans", BigDecimal.valueOf(0.65))
                ,new Article("can of beans", BigDecimal.valueOf(0.65)),new Article("can of beans", BigDecimal.valueOf(0.65))
                ,new Article("can of beans", BigDecimal.valueOf(0.65)),new Article("can of beans", BigDecimal.valueOf(0.65)));
    }
}
