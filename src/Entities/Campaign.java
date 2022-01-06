package Entities;

public class Campaign {
    public String campaignName;
    public String campaignCode;
    public int Discount;

    public Campaign(String campaignName, String campaignCode, int discount) {
        this.campaignName = campaignName;
        this.campaignCode = campaignCode;
        Discount = discount;
    }
}
