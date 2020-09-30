import org.apache.log4j.Logger;

public class Logutil {
    private static Logger log=Logger.getLogger("Testing");

    public static void info(String information)
    {
      log.info(information);
    }
    public static void warn(String information)
    {
        log.warn(information);
    }
    public static void error(String information)
    {
        log.error(information);
    }
}
