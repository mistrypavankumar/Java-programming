
interface Covaxin{
    void covaxin_details();
}

interface  Covishield{
    void covishield_details();
}

class Vaccination implements Covaxin,Covishield {

    private String vaccineName = "";
    private String manufacturer = "";
    private String rateOfVaccine = "";


    @Override
    public void covaxin_details() {

        vaccineName = "Covaxin";
        manufacturer = "Bharat Biotech";
        rateOfVaccine = "Rs.600 - Rs.1200";

        System.out.println("<<<<<< Covaxin Details >>>>>>");
        System.out.println("Name of Vaccine: " +  vaccineName);
        System.out.println("Name of Manufacturer: " + manufacturer);
        System.out.println("Rate of Vaccine: " +  rateOfVaccine);

    }

    @Override
    public void covishield_details() {
        vaccineName = "Covishield";
        manufacturer = "Verity Pharmaceuticals Inc";
        rateOfVaccine = "Rs.700 - Rs.1500";

        System.out.println("<<<<<< Covishield Details >>>>>>");
        System.out.println("Name of Vaccine: " +  vaccineName);
        System.out.println("Name of Manufacturer: " + manufacturer);
        System.out.println("Rate of Vaccine: " +  rateOfVaccine);

    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        vaccination.covaxin_details();
        System.out.println("\n");
        vaccination.covishield_details();
    }
}

