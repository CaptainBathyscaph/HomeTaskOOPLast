import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String buildingName;
    protected List<Room> rooms = new ArrayList();
    Logger logger = LogManager.getLogger();

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void addRoom(Room room)
    {
        rooms.add(room);
    }

    public Room getRoom(String name) throws RoomNotFoundException {
        for (Room room : rooms) {
            if (room.getName().equals(name))
            {
            return room;
            }
        }
        throw new RoomNotFoundException();
    }

    public void describe()
    {
        for (Room room: rooms)
        {
            logger.info( getBuildingName() + "  " + room.getName());
        }

    }

}
