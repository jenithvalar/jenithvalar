package JsonToExcelConverter;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class creatingexcel {

    List <studentdata>list;
    String Filepath = "C:\\Users\\zenith\\Desktop\\jax\\fake.json";
    XSSFWorkbook workbook;


    public void OperationRead() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        list= List.of(mapper.readValue(Paths.get(Filepath).toFile(),studentdata[].class));
      list.forEach(System.out::println);
    }

    public void Operationexcel() {
        String Header[] = {"Name", "Age", "TotalMarks"};
       workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("fake1");
        Row row = sheet.createRow(0);

        int column;
        for(column=0;column<Header.length; column++){
            Cell cell = row.createCell(column);

            cell.setCellValue(Header[column]);
            int Row_index=1;
            for (studentdata info:list) {
                XSSFRow xssfRow = sheet.createRow(Row_index++);
                xssfRow.createCell(0).setCellValue(info.getName());
                xssfRow.createCell(1).setCellValue(info.getAge());
                xssfRow.createCell(2).setCellValue(info.getTotalMarks());

            }
            }
    }
        public void excelFile() {


            try {
                FileOutputStream stream = new FileOutputStream("jenith.xlsx");
                workbook.write(stream);
                stream.close();
                workbook.close();
            } catch (Exception e) {
                e.printStackTrace();
            }





        }
    }

