package Fileprogram;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.*;

import java.io.*;
import java.util.Iterator;

public class ReadExcel {

    public static void main(String[] args) throws IOException {


//File file=new File("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/Testdata.xlsx");
        FileInputStream fin = new FileInputStream("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/Testdata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fin);
        XSSFSheet sheet=workbook.getSheet("Login");

        int Rownum= sheet.getPhysicalNumberOfRows();
        System.out.println(Rownum);
//        sheet.createRow(Rownum+1).createCell(0).setCellValue("KhalidBinWalid1");
//        fin.close();
//        FileOutputStream outFile =new FileOutputStream(new File("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/Testdata.xlsx"));
//        workbook.write(outFile);
//        outFile.close();

        String Cell1=sheet.getRow(0).getCell(0).getStringCellValue();
        
        System.out.println(Cell1);




    }
}
