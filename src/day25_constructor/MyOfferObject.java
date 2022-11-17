package day25_constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOfferObject {

    public static void main(String[] args) {

        Offer offer1=new Offer("Orhei", "Amazon", "JavaDeveloper", 123000,true, true, false, true);
        Offer offer2=new Offer("Chisinau", "Google", "JavaDeveloper", 127000,true, true, true, false);
        Offer offer3=new Offer("Balti", "Microsoft", "JavaDeveloper", 183000,true, false, true, true);
        Offer offer4=new Offer("Soroca", "Apple", "JavaDeveloper", 120000,true, true, true, false);
        Offer offer5=new Offer("Edinet", "Starbucks", "JavaDeveloper", 113000,false, true, true, true);
        Offer offer6=new Offer("Cahul", "Boeing", "JavaDeveloper", 100000,true, true, true, true);
        Offer offer7=new Offer("Floresti", "Cricova", "JavaDeveloper", 323000,true, true, true, true);


        ArrayList<Offer> offers=new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        ArrayList<Offer>fullTimeOffers=new ArrayList<>(offers);
        fullTimeOffers.removeIf(p->!p.isFullTime);

        ArrayList<Offer>locals=new ArrayList<>(offers);
        fullTimeOffers.removeIf(p->!p.location.equals("Orhei"));

        ArrayList<Offer>OffersWithBenefits=new ArrayList<>(offers);
        OffersWithBenefits.removeIf(p->!p.hasBenefit && !p.hasPTO);

        ArrayList<Offer>devOffers=new ArrayList<>(offers);
        devOffers.removeIf(p->p.jobTitle.equalsIgnoreCase("developer"));

        ArrayList<Offer>with100K=new ArrayList<>(offers);
        with100K.removeIf(p->p.salary<100000);

        System.out.println(fullTimeOffers);

    }
}
