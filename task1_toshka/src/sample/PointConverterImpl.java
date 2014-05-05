package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import model.Point;
import model.PointImpl;

public class PointConverterImpl implements PointConverter {
	static Point temp = new PointImpl();
	static List<Point> myList;
	
	@Override
	public List<Point> convertFromFile(File pointsFile) throws IOException {
		BufferedReader fin = new BufferedReader(new FileReader(pointsFile));
        String line,cash;
               
    	while ((line = fin.readLine()) != null){ 
        	int s=line.indexOf(",");
        	if(s>0){        		
        		s=line.indexOf(",");
        		cash=line.substring(0,s);
        		cash=cash.trim();
        		Long id=Long.parseLong(cash);
        		temp.setId((long)id);
        		//Long id_static=temp.getId();
        		
        		line=line.substring(s+1);
        		s=line.indexOf(",");
        		cash=line.substring(0,s);
        		cash=cash.trim();
        		temp.setName(cash);
        		//String name_s=temp.getName();
        		
        		
        		line=line.substring(s+1);
        		s=line.indexOf(",");
        		cash=line.substring(0,s);
        		cash=cash.trim();
        		double latitude = Double.parseDouble(cash);
        		temp.setLatitude(latitude);
        		latitude = temp.getLatitude();
        		
        		line=line.substring(s+1);
        		s=line.indexOf(",");
        		cash=line.substring(0,s);
        		cash=cash.trim();
        		double longitude = Double.parseDouble(cash);
        		temp.setLongitude(longitude);
        		longitude = temp.getLongitude();
        		//myList.
        		
        		for(int i=0;i<6;i++){//пропуск полей 5-10
        			line=line.substring(s+1);
        			s=line.indexOf(",");
        		}
        		
        		line=line.substring(s+1);
        		s=line.indexOf(",");
        		cash=line.substring(0,s);
        		cash=cash.trim();
        		temp.setDescription(cash);
        		//String description_s=temp.getDescription();        		
        	}
        }
        fin.close();
		return myList;
	}
	
}
