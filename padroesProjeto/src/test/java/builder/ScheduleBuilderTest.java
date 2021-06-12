
package builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *
 * @author Weslei
 */
public class ScheduleBuilderTest {
    
    @Test
    public void returnValidSchedule() {
        ScheduleBuilder scheduleBuilder = new ScheduleBuilder();
        String[] journey = {"08:00", "12:00", "13:00", "18:00"};
        Schedule schedule = scheduleBuilder
                .setDayOfWeek(1)
                .setLabelDayOfWeek("Segunda-feira")
                .setJourney(journey)
                .setName("Tabela semanal")
                .build();
        
        assertNotNull(schedule);
    }
   
    @Test
    public void returnExceptionInvalidDayOfWeek() {
        try{
            ScheduleBuilder scheduleBuilder = new ScheduleBuilder();
            String[] journey = {"08:00", "12:00", "13:00", "18:00"};
            Schedule schedule = scheduleBuilder
                    .setDayOfWeek(8)
                    .setLabelDayOfWeek("Segunda-feira")
                    .setJourney(journey)
                    .setName("Tabela semanal")
                    .build();
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Dia da semana inválido", e.getMessage());
        }
        
    }
    
    @Test
    public void returnExceptionInvalidJourney() {
        try{
            ScheduleBuilder scheduleBuilder = new ScheduleBuilder();
            String[] journey = {};
            Schedule schedule = scheduleBuilder
                    .setDayOfWeek(1)
                    .setLabelDayOfWeek("Segunda-feira")
                    .setJourney(journey)
                    .setName("Tabela semanal")
                    .build();
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Jornada inválida", e.getMessage());
        }
        
    }
    
    @Test
    public void returnExceptionInvalidName() {
        try{
            ScheduleBuilder scheduleBuilder = new ScheduleBuilder();
            String[] journey = {"08:00", "12:00", "13:00", "18:00"};
            Schedule schedule = scheduleBuilder
                    .setDayOfWeek(1)
                    .setLabelDayOfWeek("Segunda-feira")
                    .setJourney(journey)
                    .setName("")
                    .build();
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
        
    }
    
}
