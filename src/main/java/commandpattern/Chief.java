package commandpattern;

import java.util.Map;

public class Chief {

    private final Map<String, Skill> skillMap;

    public Chief(Map<String, Skill> skillMap) {
        this.skillMap = skillMap;
    }

    public void cook(String skillName){
        skillMap.getOrDefault(skillName, getNotExistSkill()).doSkill();
    }

    private Skill getNotExistSkill(){
        return new CookSkill("do Nothing");
    }
}
