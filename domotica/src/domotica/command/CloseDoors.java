package domotica.command;

import domotica.command.DoorCommand;
import domotica.model.ElectricityException;
import domotica.model.Room;

public class CloseDoors implements DoorCommand {
    private Room room;

    public CloseDoors(Room room) {
        this.room = room;
    }

    public void execute() {
        try {
            this.room.setDoorsClosed(true);
        } catch (ElectricityException var2) {
            var2.printStackTrace();
        }

    }
}
