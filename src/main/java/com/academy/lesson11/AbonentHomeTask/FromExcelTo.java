package com.academy.lesson11.AbonentHomeTask;

import com.academy.lesson11.LoggerDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


import static com.academy.lesson11.AbonentHomeTask.Filler.SHEET;

public class FromExcelTo {
    Map<Long, Subscriber> map = new HashMap<>();
    List<Subscriber> subscriberList = new ArrayList<>();

    private static final Logger LOG = LogManager.getLogger(LoggerDemo.class);

    public FromExcelTo createMapFromExcel() {
        File file = new File(new Filler().getPropertiesPath("excelFile.path"));
        try (XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file))) {
            XSSFSheet sheet = workbook.getSheet(SHEET);

            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow(i);
                long id = (long) row.getCell(0).getNumericCellValue();
                Subscriber subscriber = new Subscriber();
                subscriber.setId(id);
                subscriber.setLastName(row.getCell(1).getStringCellValue());
                subscriber.setFirstName(row.getCell(2).getStringCellValue());
                subscriber.setGender(row.getCell(3).getStringCellValue());
                subscriber.setAge((int) row.getCell(4).getNumericCellValue());
                subscriber.setPhoneNumber((row.getCell(5).getStringCellValue()));
                String operator = row.getCell(6).getStringCellValue();
                subscriber.setOperator(new Operator2(id, operator));

                map.put(id, subscriber);
                subscriberList.add(subscriber);

                LOG.debug(subscriber);
            }
//            for (Map.Entry<Long, Subscriber> item: map.entrySet()) {
//                System.out.println(String.format("Key-> %s, value-> %s", item.getKey(), item.getValue()));
//            }



        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }

    public FromExcelTo sortedListAndWritingFromListToTxt(){
//        subscriberList.stream()
//                .forEach(System.out::println);
        List<Subscriber> newSubcriberList = subscriberList.stream()
                .sorted(new ComparatorForList())
                .collect(Collectors.toList());

        try (FileWriter fw = new FileWriter(new Filler().getPropertiesPath("tXtFileSorted.path"))) {
            PrintWriter pw = new PrintWriter(fw);
            for (Subscriber item : newSubcriberList) {
                pw.println(item);
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public void ReadFromTxtAndSout(){
        try(Scanner scanner = new Scanner(new FileReader(new Filler().getPropertiesPath("tXtFileSorted.path")))) {
            int n=0;
            do {
                System.out.println(scanner.nextLine());
                n++;
            }
            while (n!=10);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }




    public void writeToTxT() {
        try (FileWriter fw = new FileWriter(new Filler().getPropertiesPath("tXtFile.path"))) {
            PrintWriter pw = new PrintWriter(fw);
            for (Map.Entry<Long, Subscriber> item : map.entrySet()) {
                pw.println(item);
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
