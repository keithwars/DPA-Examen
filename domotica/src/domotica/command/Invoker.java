package domotica.command;

import domotica.command.DoorCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Invoker {
    private List<DoorCommand> commands = new ArrayList();

    public Invoker() {
    }

    public void addCommands(DoorCommand command) {
        this.commands.add(command);
    }

    public void runCommands() {
        Iterator var2 = this.commands.iterator();

        while(var2.hasNext()) {
            DoorCommand command = (DoorCommand)var2.next();
            command.execute();
        }

        this.commands.clear();
    }
}