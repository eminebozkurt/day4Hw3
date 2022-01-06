import Abstract.BaseCampaignManager;
import Abstract.BaseGamerManager;
import Abstract.BaseSalesManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GamerCheckManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Gamer;

public class Main {

    public static void main(String[] args) {
        Gamer gamer1 = new Gamer(1,"asa","asda",1993,"asd");
        Campaign campaign = new Campaign("Yaz Firsati","YAZ2020",1);

        BaseGamerManager gamerManager = new GamerCheckManager(new MernisServiceAdapter());
        gamerManager.register(gamer1);
        gamerManager.delete(gamer1);
        gamerManager.update(gamer1);

        System.out.println("**************");

        BaseCampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(campaign);
        campaignManager.updateCampaign(campaign);
        campaignManager.deleteCampaign(campaign);

        System.out.println("**************");

        BaseSalesManager salesManager = new SalesManager();
        salesManager.sell(gamer1,campaign);








    }
}
