

class OTT
{
    public static void ottFeatures()
    {
        System.out.println("Features of OTT:\n"
                + "1.ad free\n"
                +"2.live streaming\n"
                +"3.ease to use\n"
                +"4.subtitle\n");
    }
}

class AmazonPrimeVideo extends OTT
{
    public static void display()
    {
        System.out.println("Movie name:The Family Man 2\n"
                +"Release Date:june 4,2021\n\n");
    }
}

class ZEE5 extends OTT
{
    public static void display()
    {
        System.out.println("Movie name:Aranya\n"
                +"Release Date:june 4,2021\n");
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        AmazonPrimeVideo.ottFeatures();
        AmazonPrimeVideo.display();

        ZEE5.ottFeatures();
        ZEE5.display();
    }
}
