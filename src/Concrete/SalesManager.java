package Concrete;

import Abstract.BaseSalesManager;
import Entities.Campaign;
import Entities.Gamer;

public class SalesManager extends BaseSalesManager {


    public void sell(Gamer gamer,Campaign campaign) {
        System.out.println("Oyun " + gamer.firstName
                + " adli oyuncuya, kampanya kodu: " + campaign.campaignCode + " ile satildi.");
    }

}
