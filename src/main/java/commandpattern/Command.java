package commandpattern;

public interface Command {
    void execute();
}

class ChiefCommand implements Command {

    private final Chief chief;
    private final String skillName;

    public ChiefCommand(Chief chief, String skillName) {
        this.chief = chief;
        this.skillName = skillName;
    }

    @Override
    public void execute() {
        chief.cook(skillName);
    }
}

