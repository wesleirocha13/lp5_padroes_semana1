package singleton;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Weslei
 */
public class SystemParametersTest {
    
    @Test
    public void returnVersion() {
        SystemParameters.getInstance().setVersion("1.0.0");
        assertEquals("1.0.0", SystemParameters.getInstance().getVersion());
    }
    
    @Test
    public void returnEnvironment() {
        SystemParameters.getInstance().setEnvironment("production");
        assertEquals("production", SystemParameters.getInstance().getEnvironment());
    }
    
    @Test
    public void returnCompanyName() {
        SystemParameters.getInstance().setCompanyName("Empresa A");
        assertEquals("Empresa A", SystemParameters.getInstance().getCompanyName());
    }
    
    @Test
    public void returnCompanyTimezone() {
        SystemParameters.getInstance().setCompanyTimezone("America/Sao_Paulo");
        assertEquals("America/Sao_Paulo", SystemParameters.getInstance().getCompanyTimezone());
    }
    
}
