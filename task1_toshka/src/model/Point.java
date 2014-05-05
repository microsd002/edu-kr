package model;

public interface Point {
	
	public Long getId();

    public void setId(Long id);

    public String getName();

    public void setName(String name);

    public Double getLatitude();

    public void setLatitude(Double latitude);

    public Double getLongitude();

    public void setLongitude(Double longitude);

    public String getDescription();

    public void setDescription(String description);
    
}
