import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) throws RoomNotFoundException, IlluminanceTooMuchException {
        System.setProperty("log4j.configurationFile", "C:\\Users\\Home\\IdeaProjects\\HomeTaskOop\\src\\main\\resources\\log4j2.xml");
        Logger logger = LogManager.getLogger();
        Building building1 = new Building();
        building1.setBuildingName("Здание 1");


        building1.addRoom(new Room("Комната 1", 20.0, 2));
        building1.addRoom(new Room("Комната 2", 20.0, 2));
        building1.getRoom("Комната 1").addLightBulb(new LightBulb(1500));
        building1.getRoom("Комната 1").addLightBulb(new LightBulb(1000));
        building1.getRoom("Комната 1").addLightBulb(new LightBulb(2000));




        building1.describe();


    }
}
