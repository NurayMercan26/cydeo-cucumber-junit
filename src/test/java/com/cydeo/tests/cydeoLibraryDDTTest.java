package com.cydeo.tests;

import com.cydeo.pages.cydeoStudentDasboardPage;
import com.cydeo.pages.cydeoStudentPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class cydeoLibraryDDTTest {

    cydeoStudentPage loginpage = new cydeoStudentPage();
    cydeoStudentDasboardPage dasboardPage = new cydeoStudentDasboardPage();

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoLibrary.url"));
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void LoginDDTTest() throws IOException {;
     String filePath = "CydeoStudent.xlsx";
        FileInputStream in =new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet sheet = workbook.getSheet("Sayfa1");

        for (int i = 1; i < sheet.getLastRowNum(); i++) {

            String username = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();
            String teststudent = sheet.getRow(i).getCell(2).toString();

            loginpage.login(username,password);
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
            wait.until(ExpectedConditions.visibilityOf(dasboardPage.dropdownButton));

            String actualdropdownButton = dasboardPage.dropdownButton.getText();

            XSSFCell resultCell = sheet.getRow(i).getCell(3);
            if(actualdropdownButton.contains(teststudent)){
                System.out.println("PASS");
                resultCell.setCellValue("PASS");
            }else{
                System.out.println("FAIL");
                resultCell.setCellValue("FAIL");
            }
            dasboardPage.logout();

        }
        FileOutputStream out = new FileOutputStream(filePath);
        workbook.write(out);

       in.close();
       out.close();
       workbook.close();

    }
}
