import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ClockTime {
	public Calendar cal = new GregorianCalendar();
	public int day = cal.get(Calendar.DAY_OF_MONTH);
	public int month = cal.get(Calendar.MONTH);
	public int year = cal.get(Calendar.YEAR);
	
	public int second = cal.get(Calendar.SECOND);
	public int minute = cal.get(Calendar.MINUTE);
	public int hour = cal.get(Calendar.HOUR_OF_DAY);
	public int dd = cal.get(Calendar.AM_PM);
	
	Thread ClockTime = new Thread() {
		public void run() {
			try {
				for(;;) {
				day = cal.get(Calendar.DAY_OF_MONTH);
				month = cal.get(Calendar.MONTH);
				year = cal.get(Calendar.YEAR);
				
				second = cal.get(Calendar.SECOND);
				minute = cal.get(Calendar.MINUTE);
				hour = cal.get(Calendar.HOUR_OF_DAY);
				dd = cal.get(Calendar.AM_PM);
				sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
}

