
package builder;

/**
 *
 * @author Weslei
 */
public class Schedule {

    private int dayOfWeek;
    private String labelDayOfWeek;
    private String journey[];
    private String name;
    private String description;
    

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getLabelDayOfWeek() {
        return labelDayOfWeek;
    }

    public void setLabelDayOfWeek(String labelDayOfWeek) {
        this.labelDayOfWeek = labelDayOfWeek;
    }

    public String[] getJourney() {
        return journey;
    }

    public void setJourney(String[] journey) {
        this.journey = journey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
            
}
