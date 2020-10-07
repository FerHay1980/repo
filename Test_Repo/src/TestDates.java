import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date startDate = dateFormatter.parse("2020-08-04T13:36:00");
        Date dateFrom = startDate;
        Date dateTo = addMinutesToDate(dateFrom,2);
        Date endDate = dateFormatter.parse("2020-08-04T13:50:00");

        while(endDate.compareTo(dateTo) >= 0 ){
        	System.out.println("From: " + dateFrom + " To: " +  dateTo);
        	dateFrom.setTime(dateFrom.getTime() + 120000);
        	dateTo.setTime(dateTo.getTime() + 120000);
        	//Change Has been Applied
		//Change Applied on Git side
		// One more change from Git side
        	//Change 06/10 2020
		// Change made on Gitside
        	//BHP Demo change
		//BHP Change from git side(mimic other users change)
        }
        
        
	}
	
	public static Date addMinutesToDate(Date date, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }
}
