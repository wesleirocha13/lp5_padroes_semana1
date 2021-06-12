
package builder;

/**
 *
 * @author Weslei
 */
public class ScheduleBuilder {
    
    private Schedule schedule;

    public ScheduleBuilder() {
        schedule = new Schedule();
    }

    public Schedule build() {
        if (schedule.getDayOfWeek() == 0 || schedule.getDayOfWeek() > 7) {
            throw new IllegalArgumentException("Dia da semana inválido");
        }
        if (schedule.getJourney().length == 0) {
            throw new IllegalArgumentException("Jornada inválida");
        }
        if (schedule.getName().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return schedule;
    }

    public ScheduleBuilder setDayOfWeek(int dayOfWeek) {
        schedule.setDayOfWeek(dayOfWeek);
        return this;
    }
    
    public ScheduleBuilder setLabelDayOfWeek(String labelDayOfWeek) {
        schedule.setLabelDayOfWeek(labelDayOfWeek);
        return this;
    }
 
    public ScheduleBuilder setJourney(String[] journey) {
        schedule.setJourney(journey);
        return this;
    }
    
    public ScheduleBuilder setName(String name) {
        schedule.setName(name);
        return this;
    }
    
    public ScheduleBuilder setDescription(String description) {
        schedule.setDescription(description);
        return this;
    }
}
