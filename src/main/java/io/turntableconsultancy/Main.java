package TurntablConsultancyModelling;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Register turntablRegister;
        List<Client> clientsList = new ArrayList<>();

        Corporate fidelityBank;
        Corporate goldmanSachs;
        Private humanOne;
        Private humanTwo;

        goldmanSachs = new Corporate("GS","01gs",ServiceLevel.Platinum,"Brako-Kusi");
        humanOne = new Private("Raymond","419",ServiceLevel.Premium);
        humanTwo = new Private("Dzifa","914",ServiceLevel.Premium);

        clientsList.add(humanOne);
        clientsList.add(humanTwo);

        clientsList.add(goldmanSachs);

        turntablRegister = new Register(clientsList);
        System.out.println(turntablRegister.getNameByID("419"));

    }
}
