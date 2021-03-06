package com.syntax.class32.excelFile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWritingDemo3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Jama\\Desktop\\Coding\\Java\\SyntaxJava\\Files\\MyOwnFile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        //Sheet mySheet = xssfWorkbook.createSheet("MySheet");
        Sheet mySheet = xssfWorkbook.getSheet("MySheet");
        Row row = mySheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("My First File");
        fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);
    }
}
