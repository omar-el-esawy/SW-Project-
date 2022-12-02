package service;

public class ServiceFactory {

    public Service create(String serviceType) {
        if (serviceType.equals("Mobile Recharge"))
            return new MobileRechargeService();
        else if (serviceType.equals("Internet Payment"))
            return new InternetPaymentService();

        else if (serviceType.equals("Donation"))
            return new DonationService();

        else if (serviceType.equals("Landline"))
            return new LandlineService();
        else
            return null;
    }

}
