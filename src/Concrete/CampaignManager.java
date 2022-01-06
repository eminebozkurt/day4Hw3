package Concrete;

import Abstract.BaseCampaignManager;
import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager extends BaseCampaignManager {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya eklendi: " + campaign.campaignCode);
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya guncellendi: " + campaign.campaignCode);
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Kampanya silindi: " + campaign.campaignCode);
    }
}
