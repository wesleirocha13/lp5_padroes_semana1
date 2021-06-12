package singleton;

/**
 * @author Weslei
 */
public class SystemParameters {

    private SystemParameters() {};
    private static SystemParameters instance = new SystemParameters();

    public static SystemParameters getInstance() {
        return instance;
    }

    private String version;
    private String environment;
    private String name;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
