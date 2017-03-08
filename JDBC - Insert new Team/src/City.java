

public class City {
  
  private Long cityId;
  private String cityName;

  public City() {
  }
  
  public City(Long cityId, String cityName) {
      this.cityId = cityId;
      this.cityName = cityName;
  }

  public Long getCityId() {
      return cityId;
  }

  public void setCityId(Long cityId) {
      this.cityId = cityId;
  }

  public String getCityName() {
      return cityName;
  }

  public void setCityName(String cityName) {
      this.cityName = cityName;
  }
 
  
  @Override
  public String toString() {
      return   cityName ;
  }
  
}
