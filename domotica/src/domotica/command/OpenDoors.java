package domotica.command;

import domotica.command.DoorCommand;
import domotica.model.ElectricityException;
import domotica.model.Room;

public class OpenDoors implements DoorCommand {
    private Room room;

    public OpenDoors(Room room) {
        this.room = room;
    }

    public void execute() {
        try {
            this.room.setDoorsClosed(false);
        } catch (ElectricityException var2) {
            var2.printStackTrace();
        }

    }
}