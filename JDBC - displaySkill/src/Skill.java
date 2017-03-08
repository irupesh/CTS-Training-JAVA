

public class Skill {
    private Long skilld;
    private String skillName;

    public Skill(Long skilld, String skillName) {
        this.skilld = skilld;
        this.skillName = skillName;
    }

    public Long getSkilld() {
        return skilld;
    }

    public void setSkilld(Long skilld) {
        this.skilld = skilld;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
   
    
    @Override
    public String toString() {
        return  skillName ;
    }
    

}

