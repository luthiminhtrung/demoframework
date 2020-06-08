package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.awt.image.ImageProducer;
import java.io.*;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class PractiseJava {
    private static String fileText = "test";

    public static void main(String arg[]){
      WebDriver driver=null;
      util(driver, d -> {
          return (Boolean)((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
      }, 5);

      //not using wait for element to be clickable => get text because maybe the element is visible but the old page has not loaded completely
        // in that case that is the old test. we can use wait until text to be present in element()
    }


    public static void util(WebDriver driver, Function<WebDriver, Boolean> waitCondition, int timeoutInSeconds){
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
        try{
            webDriverWait.until(waitCondition);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean isJQuery(WebDriver driver){
        return (Boolean)((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
    }

    public static void createFiles(Map<String,List> files) {
        String fileName;
        List contents;
        //for(var key : files.keySet()){
        files.forEach((k,v) -> {
            try {
                FileWriter writer = new FileWriter(k, true);
                for (int i =0;i<v.size();i++){
                    writer.write((String)v.get(i));
                    writer.write("\r\n");   // write new line
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
           // contents = files.get(key);
//            try {
//                FileWriter writer = new FileWriter(key, true);
//                for (int i =0;i<contents.size();i++){
//                    writer.write((String)contents.get(i));
//                    writer.write("\r\n");   // write new line
//                }
//                writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


        }



    private static Map getFiles() {
        List as = new ArrayList();
        as.add(123);

        int b=2;
        int j=0;
        List duplicate = new ArrayList();
        //find the existence of the element in the list or not
        for (int i=0;i<as.size();i++){
            if (as.get(i).equals(b)){
                j++;
                duplicate.add(i);
            }
        }
        System.out.print("There are %s item % in the list" + duplicate.size() );

        //find if that is an tam giac can with 3 parameter
        //2 canh = nhau va ko phai 3 () -> canh = nhau
        int x=1;
        int y=1;
        int  z=3;
        boolean rsult;
        if (x==y && x!=z){
            rsult=true;
        } else if (x == z && x != y) {
            rsult=true;
        }
        else if (z==y && x!=y)
            rsult=true;
        else
            rsult =false;






        Map files = new HashMap();
        String fileName;
        String[] splitLine;


        try {
            FileReader reader = new FileReader("/Users/trunglu/Documents/automationTraining/trungframeworkpractise/src/main/resources/test");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                List contents = new ArrayList();
                System.out.println(line);
                splitLine = line.split("\\.");
                System.out.println(splitLine[0]);
                fileName=fileText + "." + splitLine[1];
                if (files.get(fileName)!=null){
                    contents = (List) files.get(fileName);
                }
                contents.add(line);
                files.put(fileName,contents);


            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return files;

    }

}
