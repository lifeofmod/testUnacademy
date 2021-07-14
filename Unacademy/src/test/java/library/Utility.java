package library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utility
{
    String path = "D:\\Wrkspcc\\testUnacademy\\Unacademy\\Properties\\config.properties";
    File configFile = new File(path);
    FileReader reader ;
    Properties props ;    
    
    public void configfileinitialization() throws IOException
    {
        reader = new FileReader(configFile);
        props = new Properties();
        props.load(reader);
    }
    
    public String getWebDriver() throws IOException
    {
        configfileinitialization();
        return props.getProperty("WebDriver");
    }

 

    public String getBaseUrl() throws IOException
    {
        configfileinitialization();
        return props.getProperty("baseUrl");
    }

 

    public String getExecutor() throws IOException
    {
        configfileinitialization();
        return props.getProperty("Browser");
           
    }
    
    
    public String getExcelSheetPath() throws IOException
    {
        configfileinitialization();
        return props.getProperty("ExcelPath");
    }
    
    public String getExcelSheet1Name() throws IOException
    {
        configfileinitialization();
        return props.getProperty("Sheetname");
    }
}