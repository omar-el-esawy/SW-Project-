package service;

public class ServiceFactory {

    public Service create(String serviceType) {
        if (serviceType.equals("1"))
            return new MobileRechargeService();
        else if (serviceType.equals("2"))
            return new InternetPaymentService();

        else if (serviceType.equals("3"))
            return new DonationService();

        else if (serviceType.equals("4"))
            return new LandlineService();
        else
            return null;
    }

}
