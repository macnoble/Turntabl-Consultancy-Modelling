package io.turntabl;

import TurntablConsultancyModelling.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;



import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterTest {
    Corporate fidelityBank;
    Corporate goldmanSachs;
    Private humanOne;
    Private humanTwo;

    Register turntablRegister;
    List<Client> clientsList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getNameByServiceLevel() {
        goldmanSachs = new Corporate("GS","01gs", ServiceLevel.Platinum,"Brako-Kusi");
        fidelityBank = new Corporate("FB","01fb",ServiceLevel.Gold,"Mac-Noble");
        humanOne = new Private("Raymond","419",ServiceLevel.Premium);
        humanTwo = new Private("Dzifa","914",ServiceLevel.Premium);

        clientsList.add(humanOne);
        clientsList.add(humanTwo);
        clientsList.add(goldmanSachs);

        turntablRegister = new Register(clientsList);

        //assertEquals("Mac-Noble",turntablRegister.getNameByServiceLevel(ServiceLevel.Gold).get(0));
    }

    @Test
    public void getNameByID() {


        fidelityBank = new Corporate("FB","01fb",ServiceLevel.Gold,"Mac-Noble");
        goldmanSachs = new Corporate("GS","01gs",ServiceLevel.Platinum,"Brako-Kusi");
        humanOne = new Private("Raymond","419",ServiceLevel.Premium);
        humanTwo = new Private("Dzifa","914",ServiceLevel.Premium);

        clientsList.add(humanOne);
        clientsList.add(humanTwo);
        clientsList.add(fidelityBank);
        clientsList.add(goldmanSachs);

        turntablRegister = new Register(clientsList);

        assertEquals("Raymond",turntablRegister.getNameByID("419"));

    }

    @Test
    public void countByServiceLevel() {
        turntablRegister = new Register(clientsList);
        fidelityBank = new Corporate("FB","01fb",ServiceLevel.Gold,"Mac-Noble");
        goldmanSachs = new Corporate("GS","01gs",ServiceLevel.Platinum,"Brako-Kusi");
        humanOne = new Private("Raymond","419",ServiceLevel.Premium);
        humanTwo = new Private("Dzifa","914",ServiceLevel.Premium);

        clientsList.add(humanOne);
        clientsList.add(humanTwo);
        clientsList.add(fidelityBank);
        clientsList.add(goldmanSachs);

    }
}