package com.garantibbva.test;

import com.garantibbva.base.BaseTest;
import com.garantibbva.page.BasketPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static com.garantibbva.constans.ConstansTrendyolPage.*;

public class BasketPageTest extends BaseTest {

    BasketPage basketPage;

    @Before
    public void before() {
        basketPage = new BasketPage(getWebDriver());
    }

    @Test
    public void test() {
        basketPage.closePop().search(PRODUCT).searchClick().clickProduct().addBasket();
        String productname = basketPage.getText();
        basketPage.goBasket();

        Assert.assertEquals(productname, basketPage.getTextBasket());
    }

    @After
    public void after(){
        getWebDriver().quit();
    }

}
