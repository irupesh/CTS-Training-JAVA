package team;

  
public class City {
    private int id;
    private String name;
    

    public City(String name) {
       
        this.name = name;
        
    }

    
    public City(int id, String name) {
    	this.name = name;
    	this.id = id;
	}

	public City() {
		
	}


	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}


