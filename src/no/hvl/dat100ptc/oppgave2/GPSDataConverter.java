package no.hvl.dat100ptc.oppgave2;

import static org.junit.jupiter.api.Assertions.assertEquals;



import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave2.GPSDataConverter;



import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {
	
	private static int TIME_STARTINDEX = 11; 

	public static int toSeconds(String timestr) {
		
		String timePart = timestr.substring(TIME_STARTINDEX, TIME_STARTINDEX + 8);
		
		String[] parts = timePart.split(":");
		int hr = Integer.parseInt(parts[0]);
		int min = Integer.parseInt(parts[1]);
		int sec = Integer.parseInt(parts[2]);
		
		return hr*60*60 + min*60 + sec;
		//timestr = "2017-08-13T08:52:26.000";
		//String latitudeStr = "60.385390";
		//String longitudeStr = "5.217217";
		//String elevationStr = "61.9";
		
		
		
		
		
		
		
//  return(8*60*60 + 52*60 + 26) + GPSDataConverter.toSeconds(timestr);
		
		
			
	
	
//		
		
		
		
		// TODO
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;
		
		int time = toSeconds(timeStr);
		double latitude = Double.parseDouble(latitudeStr);
		double longitude = Double.parseDouble(longitudeStr);
		double elevation = Double.parseDouble(elevationStr);
		
		// TODO 
		//throw new UnsupportedOperationException(TODO.method());
		
		return new GPSPoint(time, latitude,longitude, elevation);
	}
	
}
