package lockdown;

class Lock2_0{
    public static void guidelines(){
        System.out.println("<<<<<< Lockdown Guidelines >>>>>>");
        System.out.println("Telangana government has decided to impose a 10-days lockdown across the state.");
        System.out.println("Guidelines to be followed are: ");
        System.out.println("1. Lockdown will be in full force from 10am to 6am");
        System.out.println("2. Daily relaxations are allowed for four hours in the morning between 6am to 10am.");
        System.out.println("3. Take precaution, wear masks and keep maintaining social distance from others");
    }

    public static void essentialServices(){
        System.out.println("<<<<<< Lockdown Essential Services >>>>>>");
        System.out.println("1. Electricity - stable power supply with no loadshedding");
        System.out.println("2. Water supply, sewerage and sanitation");
        System.out.println("3. Food and essential products - related manufacturing and processing");
        System.out.println("4. Healthcare related services");
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Lock2_0.guidelines();
        System.out.println("\n\n");
        Lock2_0.essentialServices();
    }
}
