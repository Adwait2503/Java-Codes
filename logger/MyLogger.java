package logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {

	public static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

	public static void main(String[] args) throws Throwable, IOException {
//		ConsoleHandler consoleHandler = new ConsoleHandler();
//		consoleHandler.setLevel(Level.SEVERE);
//		LOGGER.addHandler(consoleHandler);
		FileHandler fileHandler = new FileHandler("C:\\Users\\ASUS\\Desktop\\Log\\log.log");
		Formatter myFromatter = new MyFromatter();
		fileHandler.setFormatter(myFromatter);
		LOGGER.addHandler(fileHandler);
		LOGGER.setLevel(Level.FINE);
		LOGGER.finest("From Finest");
		LOGGER.finer("From Finer");
		LOGGER.fine("From Fine");
		LOGGER.config("From Config");
		LOGGER.info("From Info");
		LOGGER.warning("From Warning");
		LOGGER.severe("From Server");
	}
}
