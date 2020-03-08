package com.garantibbva.page;

import com.garantibbva.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.garantibbva.constans.ConstansTrendyolPage.*;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage search(String product){
        sendKeys(INPUT,product);
        return this;
    }

    public BasketPage searchClick() {
        click(SEARCH);
        return this;
    }

    public BasketPage closePop(){
        click(POP);
        return this;
    }

    public BasketPage clickProduct(){
        click(PRODUCT_PATH);
        return this;
    }
    public BasketPage addBasket(){
        click(ADDBASKET);
        return this;
    }
    public BasketPage goBasket(){
        click(BASKET);
        return this;
    }

    public String getText(){
       return  getText(PRODUCT_NAMEPAGE);

    }
    public String getTextBasket(){
        return  getText(PRODUCT_NAMEBASKET);

    }


}
