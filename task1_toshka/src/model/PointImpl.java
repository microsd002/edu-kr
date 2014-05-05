package model;

import java.text.NumberFormat;

public class PointImpl implements Point {
	NumberFormat nf = NumberFormat.getInstance();
    //todo: make all fields private
    //todo: rename all fields in camelCase style
    //todo: make all fields non-static
	static Long id_static;
	static String name_s;
	static double latitude_s;
	static double longitude_s;
	static String description_s;
	
	
	/**public void setLocation(int x, int y){
		
				
	}**/
	
	@Override
	public Long getId() {
		
		return id_static;
	}

	@Override
	public void setId(Long id) {
		String a=""+id;
		id_static=id;
		while(a.length()<2){
			a = a + " ";
		}
        //todo: dont use println here
		System.out.print('|'+ a +'|');
	}

	@Override
	public String getName() {
	
		return name_s;
	}

	@Override
	public void setName(String name) {
		while(name.length()!=8){
			name = name + " ";
		}
		name_s=name;
        //todo: dont use println here
		System.out.print(name+'|');
	}

	@Override
	public Double getLatitude() {
		
		return latitude_s;
	}

	@Override
	public void setLatitude(Double latitude) {
		nf.setMaximumFractionDigits(6);
		nf.setMinimumFractionDigits(6);
		latitude_s=latitude;
        //todo: dont use println here
		System.out.print(nf.format(latitude));
		System.out.print('|');

	}

	@Override
	public Double getLongitude() {
		
		return longitude_s;
	}

	@Override
	public void setLongitude(Double longitude) {
		nf.setMaximumFractionDigits(6);
		nf.setMinimumFractionDigits(6);
		longitude_s=longitude;
        //todo: dont use println here
		System.out.print(nf.format(longitude));
		System.out.print('|');

	}

	@Override
	public String getDescription() {
		
		return description_s;
	}

	@Override
	public void setDescription(String description) {
		description_s=description;
        //todo: dont use println here
		System.out.print(description+'|');
		System.out.println("");
	}

}
