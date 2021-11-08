package TurntablConsultancyModelling;

import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Client> clientRegister;


    public Register(List<Client> clientRegister) {
        this.clientRegister = clientRegister;
    }

    public List<String> getNameByServiceLevel(ServiceLevel serviceLevel){
        return clientRegister.stream().filter(client -> client.getServiceLevel() == serviceLevel).map(client -> client.getName()).collect(Collectors.toList());
    }

    public String getNameByID(String clientID){
        return clientRegister.stream().filter(client -> client.getId() == clientID).map(client -> client.getName()).findFirst().orElse("No client with supplied ID");
    }

    public void countByServiceLevel(){
        int goldStream = clientRegister.stream().filter(client -> client.getServiceLevel() == ServiceLevel.Gold).collect(Collectors.toList()).size();
        int platinumStream = clientRegister.stream().filter(client -> client.getServiceLevel() == ServiceLevel.Platinum).collect(Collectors.toList()).size();
        int premiumStream = clientRegister.stream().filter(client -> client.getServiceLevel() == ServiceLevel.Premium).collect(Collectors.toList()).size();
        System.out.println(goldStream + " Gold clients, " + platinumStream + " Platinum clients, and " + premiumStream + " Premium clients.");
        return;
    }

    public List<Client> getClientRegister() {
        return clientRegister;
    }

    public void setClientRegister(List<Client> clientRegister) {
        this.clientRegister = clientRegister;
    }

    @Override
    public String toString() {
        return "Register{" +
                "clientRegister=" + clientRegister +
                '}';
    }

}