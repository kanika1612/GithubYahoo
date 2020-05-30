package com.pages.MavenYahoo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenYahoo.AutoConstant;
import com.generics.MavenYahoo.BasePage;
import com.generics.MavenYahoo.ExcelLibrary;



public class POMFramework extends BasePage implements AutoConstant{
   @FindBy(xpath="//input[@name='firstName']")
   private WebElement firstnameTextfield;
   
   @FindBy(xpath="//input[@placeholder='Surname']")
   private WebElement surnameTextfield;
   
   @FindBy(xpath="//input[@id='usernamereg-yid']")
   private WebElement emailTextfield;
   
   @FindBy(xpath="//input[@name='password']")
   private WebElement passwordfield;
   
   @FindBy(xpath="//input[@name='phone']")
   private WebElement mobileTextfield;
   
   @FindBy(xpath="//select[@name='mm']")
   private WebElement birthMonthDropDownList;
   
   @FindBy(xpath="//input[@placeholder='Day']")
   private WebElement birthDayTextfield;
   
   @FindBy(xpath="//input[@placeholder='Year']")
   private WebElement birthYearTextfield;
   
   @FindBy(xpath="//input[@placeholder='Gender (optional)']")
   private WebElement genderTextfield;
   
   public POMFramework(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   
   public void enterDetails() throws IOException, InterruptedException {
	   firstnameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 0));
	   surnameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 1));
	   emailTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 2));
	   Thread.sleep(5000);
	   passwordfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 3));
	   Thread.sleep(2000);
	   mobileTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 4));
	   selectbyvisibletext(birthMonthDropDownList, "March");
	   Thread.sleep(5000);
	   birthDayTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 5));
	   birthYearTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 6));
	   genderTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheetname, 1, 7));
	   }
}
