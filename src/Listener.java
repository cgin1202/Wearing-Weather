import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;


public class Listener implements ActionListener{

	public int hour;
	public int min;
	public int sec;
	
	public int year;
	public int month;
	public int day;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Calendar rightnow = Calendar.getInstance();
		
		hour = rightnow.get(Calendar.HOUR_OF_DAY);
		min = rightnow.get(Calendar.MINUTE);
		sec = rightnow.get(Calendar.SECOND);
		
		year = rightnow.get(Calendar.YEAR);
		month = rightnow.get(Calendar.MONTH);
		day = rightnow.get(Calendar.DAY_OF_MONTH);
		month++;
		RealFrame.p0.todayDate.removeAll();
		RealFrame.p0.todayDate.repaint();
		RealFrame.Pane.revalidate();
		RealFrame.p0.DAYOFYEAR.setText(year + "년 " + month + "월 " + day + "일");
		RealFrame.p0.todayDate.setText(hour + "시 " + min + "분 "+ sec+ "초");
		
		RealFrame.p0.todayDate.repaint();
		RealFrame.Pane.revalidate();
		
	}

}
