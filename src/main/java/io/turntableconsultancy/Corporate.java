package TurntablConsultancyModelling;


public class Corporate extends Client{
    private String accountManager;


    public Corporate(String name, String id, ServiceLevel serviceLevel, String accountManager) {
        super(name, id, serviceLevel);
        this.accountManager = accountManager;
    }

    public String getName() {
        return accountManager;
    }

    public void setName(String accountManager) {
        this.accountManager = accountManager;
    }

}
