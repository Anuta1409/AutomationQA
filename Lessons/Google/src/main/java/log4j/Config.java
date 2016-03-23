package log4j;

import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Config {
    private static Properties logProperties = new Properties();
    private static String logFile;

    @SuppressWarnings("static-access")
    public Config(String logFile){
        this.logFile = logFile;
    }

    public void init(){
        try {
            logProperties.load(new FileInputStream(logFile));
            PropertyConfigurator.configure(logProperties);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
