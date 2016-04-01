package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Config {

    public static Logger initLogger(String loggerName){
        Logger logger = Logger.getLogger(loggerName);
        PropertyConfigurator.configure("log4j.properties");
        return logger;
    }





}
