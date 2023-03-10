package singleton;

public class Services {

    private Services() {};
    private static final Services instance = new Services();
    public static Services getInstance() {
        return instance;
    }

    private String financialServiceHost;
    private String financialServiceAccessKey;
    private String financialServiceSecretKey;

    public String getFinancialServiceHost() {
        return financialServiceHost;
    }

    public void setFinancialServiceHost(String financialServiceHost) {
        this.financialServiceHost = financialServiceHost;
    }

    public String getFinancialServiceAccessKey() {
        return financialServiceAccessKey;
    }

    public void setFinancialServiceAccessKey(String financialServiceAccessKey) {
        this.financialServiceAccessKey = financialServiceAccessKey;
    }

    public String getFinancialServiceSecretKey() {
        return financialServiceSecretKey;
    }

    public void setFinancialServiceSecretKey(String financialServiceSecretKey) {
        this.financialServiceSecretKey = financialServiceSecretKey;
    }
}