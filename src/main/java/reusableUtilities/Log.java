package reusableUtilities;

import org.apache.log4j.Logger;
/**
 * @author KT1549
 * @CreatedDate 03-05-2023
 * @param Generates reports in logger file which is easy to read
 */
public class Log {
private static Logger logger = Logger.getLogger(Log.class.getName());
	
	public static void info(String msg) {
		logger.info(msg);
	}
	
	public static void debug(String msg) {
		logger.debug(msg);
	}
}
