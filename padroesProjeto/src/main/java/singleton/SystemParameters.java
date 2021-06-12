package singleton;

/**
 * @author Weslei
 * 
 * Classe parâmetros de um sistema de ponto online
 * Aqui são definidos parâmetros que ficaram disponíveis para todo o sistema
 */
public class SystemParameters {

    private SystemParameters() {};
    private static SystemParameters instance = new SystemParameters();

    public static SystemParameters getInstance() {
        return instance;
    }

    private String version;
    private String environment;
    private String companyName;
    private String companyTimezone;

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
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getCompanyTimezone() {
        return companyTimezone;
    }

    public void setCompanyTimezone(String companyTimezone) {
        this.companyTimezone = companyTimezone;
    }
}
