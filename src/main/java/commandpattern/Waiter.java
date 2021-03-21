package commandpattern;

import java.util.LinkedList;
import java.util.Queue;

public class Waiter {

    private Queue<Command> commands = new LinkedList<>();

    public void setCommand(Command command) {
        commands.offer(command);
    }

    public void executeCommand() {
        while (!commands.isEmpty()) {
            commands.poll().execute();
        }
    }
}
