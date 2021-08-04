package javaDifferent_progrmming_concepts.keywords;

/*
    => 'super' is a keyword which is used by subclass to refer to it's immediate base class.
    =>  There are two uses of 'super' keyword
        1. It is used to call superclass constructor
        2. It is used to access a member of a superclass

 */

class Area{
    private double width,height,depth;
    String topicName = "use of super keyword";


    Area(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double findVolume(){
        return width * height * depth;
    }
}


class SuperKeywordDemo extends Area{
    double weight;

    SuperKeywordDemo(double w, double h, double d, double m){
        super(w,h,d);   // calls superClass constructor
        weight = m;
    }


    public void showTopicName(){
        System.out.println("Topic: " + super.topicName);    // accessing superClass member
    }
}

public class UseOfSuperKeyword {
    public static void main(String[] args) {
        SuperKeywordDemo skd = new SuperKeywordDemo(1,2,3,4);
        System.out.println("Result: " +  skd.findVolume());
        skd.showTopicName();
    }
}
