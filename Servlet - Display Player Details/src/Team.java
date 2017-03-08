public class Team {
    private int id;
    private String name;
    private String code;

    public Team(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public Team() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
}
