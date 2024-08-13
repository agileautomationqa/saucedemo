package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Hiral Yagnik
 * Project Name: Saucedemo
 */
public class ProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    @FindBy(xpath = "//span[@class='title']")
    WebElement pageHeading;
     By pageHeadingby = By.xpath("//span[@class='title']");

    @FindBy(xpath = "//div[@class='inventory_item']")
    List<WebElement> productElements;



    public String getPageHeading() {
        log.info("Get page heading " + pageHeading.toString());
        waitUntilElementIsPresent(pageHeadingby, 20);
        return getTextFromElement(pageHeading);
    }

    public String getProductsPerPage() {
        List<String> productElementList = getStringList(productElements);
        int size = productElementList.size();
        log.info("Get product list size " + size);
        return String.valueOf(size);
    }
}
