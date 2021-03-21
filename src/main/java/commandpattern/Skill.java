package commandpattern;

public interface Skill {
    void doSkill();
}

class CookSkill implements Skill {

    private final String cookingMsg;

    public CookSkill(String cookingMsg) {
        this.cookingMsg = cookingMsg;
    }

    @Override
    public void doSkill() {
        System.out.println(cookingMsg);
    }
}
