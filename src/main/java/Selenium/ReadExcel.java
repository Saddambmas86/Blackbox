package Selenium;



import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcel {

    public static void main(String[] args) throws IOException {


        FileInputStream Fin = new FileInputStream("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/Testdata.xlsx");

        XSSFWorkbook wb=new XSSFWorkbook(Fin);
        XSSFSheet sh=wb.getSheet("Login");

        int Rownum=sh.getPhysicalNumberOfRows();
        System.out.println(Rownum);

for(int i=1;i<Rownum;i++){
    XSSFCell username = sh.getRow(i).getCell(0);
    username.setCellType(CellType.STRING);
    System.out.println(username.getStringCellValue());

    XSSFCell password = sh.getRow(i).getCell(1);
    password.setCellType(CellType.STRING);
    System.out.println(password.getStringCellValue());

    XSSFCell Env = sh.getRow(i).getCell(2);
    password.setCellType(CellType.STRING);
    System.out.println(Env.getStringCellValue());


if(Env.toString().equalsIgnoreCase("QA")){
    sh.getRow(i).createCell(3).setCellValue("Password Correct");
}
else{
    sh.getRow(i).createCell(3).setCellValue("Password Incorrect");
}
}

Fin.close();
        FileOutputStream Fout=new FileOutputStream(new File("C:/Users/Saddam/Desktop/TipsTricks/Blackbox/src/main/resources/Testdata.xlsx"));
wb.write(Fout);
Fout.close();

    }
}
