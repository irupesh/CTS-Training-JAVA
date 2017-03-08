




public class Team {
  

  private String name;
  private String coach;


  private City city;
  

  public Team() {
  }
  
  public Team(String name, String coach,City city) {
     
      this.name = name;
      this.coach = coach;
       this.city = city;
      
  }
  

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getCoach() {
      return coach;
  }

  public void setCoach(String coach) {
      this.coach = coach;
  }


  
  
  public City getCity() {
      return city;
  }

  public void setCity(City city) {
      this.city = city;
  }
  


   @Override
  public String toString() {
        return String.format("%-35s%-35s%-15s",name ,coach,city );
  }

}
