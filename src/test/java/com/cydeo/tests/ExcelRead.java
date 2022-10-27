package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {

        String path = "SampleData.xlsx";
        File file = new File(path);

        //to read from excel we need to load it to FileInput Stream

        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook>sheet>row>cell

        //<1>Create a workbook
        XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);
        //<2> we need to get specific sheet from currently opened workbook

        XSSFSheet sheet = workbook.getSheet("Sayfa1");

        //<3>Select row and cell
        //print out Mary's cell
        //Indexes start from zero

        System.out.println(sheet.getRow(1).getCell(0));

        //print out Developer
        System.out.println(sheet.getRow(3).getCell(2));

        //Return the count of used cell only
        //Starts counting from 1
        int usedRows= sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);

        //TODO: Create a logic to print Vinod's name
        for (int rowNum= 0; rowNum < usedRows ; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }

        }
        //TODO: Create a logic to print out Linda's jop_Id
        for (int rowNum= 0; rowNum < usedRows ; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Linda")){
                System.out.println("Linda's jop ID is "+sheet.getRow(rowNum).getCell(2));
            }

        }


    }

}
