

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    
    public static void main(String ags[]) throws Exception {
        System.out.format("%-25s %s\n","Skill","Players");
        TreeMap<Skill,Integer> skillCountMap = null;
        SkillDAO skillDAOIns = new SkillDAO();
       
        //fill your code
        skillCountMap = skillDAOIns.skillCount();
        
        for(Map.Entry<Skill,Integer> entry:skillCountMap.entrySet()){    
        	System.out.format("%-25s %s\n",entry.getKey().getSkillName(),entry.getValue()); 
	    }  
        
    }
}
