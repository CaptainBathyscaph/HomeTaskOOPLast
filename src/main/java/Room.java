import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private Double area;
    private Integer numberOfWindows;

    private List<LightBulb> lightBulbList = new ArrayList();

   protected Room (String name, Double area, Integer numberOfWindows)
   {
       this.name = name;
       this.area = area;
       this.numberOfWindows = numberOfWindows;
   }
    public void addLightBulb(LightBulb lightBulb) throws IlluminanceTooMuchException {
       if (this.calculateWindowBrightness() + this.calculateLightBulbBrightness() < 4000 )
       { lightBulbList.add(lightBulb);}
       else throw new IlluminanceTooMuchException();
    }


    public Integer calculateLightBulbBrightness()
    {
        Integer counter = 0;
        for (LightBulb lightBulb: lightBulbList)
        {
            counter = counter + lightBulb.getBrightness();
        }
        return counter;
    }

    public Integer calculateWindowBrightness()
    {
        return this.numberOfWindows*700;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", illumination=" + numberOfWindows + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(Integer numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

}
