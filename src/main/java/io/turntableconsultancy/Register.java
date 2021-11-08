package io.turntableconsultancy;

import java.util.List;
import java.util.Map;
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

    public Map<ServiceLevel, Long> countByServiceLevel(){
        return clientRegister.stream().collect(Collectors.groupingBy(Client::getServiceLevel, Collectors.counting()));
//      return clientRegister.stream().map(Client::getServiceLevel).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
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