

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;


public class Main {
    
    public static void main(String ags[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("List of all skills"); 
        List<Skill> skillList = null;
        SkillDAO skillIns = new SkillDAO();
 
   //fill code here
        skillList = skillIns.listAllSkills();
        int count = 1;
        for(Skill skill :skillList){
        	System.out.println((count++)+") "+skill.getSkillName());
        } 
        
    }
}
