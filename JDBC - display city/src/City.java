



public class City {
  private Long cityId;
  private String cityName;

  public City(Long cityId, String cityName) {
      this.cityId = cityId;
      this.cityName = cityName;
  }

  public Long getSkilld() {
      return cityId;
  }

  public void setCityId(Long cityId) {
      this.cityId = cityId;
  }

  public String getSkillName() {
      return cityName;
  }

  public void setSkillName(String cityName) {
      this.cityName = cityName;
  }
 
  
  @Override
  public String toString() {
      return  cityName ;
  }
  

}
