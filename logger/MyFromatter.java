package logger;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFromatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		return record.getMessage() + ":" + record.getSourceMethodName() + ":" + record.getLoggerName() + ":"
				+ record.getLevel() + "\n";
	}

}
