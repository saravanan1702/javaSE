package interfacesinJava;
//we can implement multipel classes(interface)in java
//mainly used for achive multiple inheritace
//class have only one time extend ,implement we can mutiple times
//normal class(Concrete class)
class Phone{
    void call(){
        System.out.println("You can Make a Call ");
    }
    void sms(){
        System.out.println("You can sms to someone");
    }
}
interface IMusic{
    //I for interface =>not mandatory but we can easy to refer that this is interface
    void play();
    void pause();
    void stop();
}
interface ICamera{
    void click();
    void record();
}
//create concrete class to access everything that we create object for smartphone
class SmartPhone extends Phone implements IMusic,ICamera{
    //own method
    void mms(){
        System.out.println("you can sent mms");
    }
    void videoCall(){
        System.out.println("you can make video call");
    }
    //overriding interfaces (camera)

    @Override
    public void click() {
        System.out.println("click to snap");
    }

    @Override
    public void record() {
        System.out.println("Record the video");
    }
    //overriding interfaces(Music)

    @Override
    public void play() {
        System.out.println("play the song");
    }

    @Override
    public void pause() {
        System.out.println("pause the song");
    }

    @Override
    public void stop() {
        System.out.println("Stop the song");
    }
}

public class InterfaceExampleSmartphone {
    public static void main(String[] args) {
        //now create object for smartphone
        SmartPhone s=new SmartPhone();
        s.call();
        s.videoCall();
        s.sms();
        s.mms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
        System.out.println("\n");
        //now create refernce for phone ,the smartphone just behavelike a normal phone
        Phone p=s;
        //because we create referce for phone,phone reference knows only which methods they have
        System.out.println("smartphone behave like as a normal phone");
        p.call();
        p.sms();
        System.out.println("\n");
        System.out.println("smart phone behave like a camera");
        ICamera c=s;
        c.click();
        c.record();
        System.out.println("\n");
        System.out.println("Smart phone behave like a music player");
        IMusic m=s;
        m.play();
        m.stop();
        m.pause();

    }
}
