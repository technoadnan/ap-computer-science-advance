class Phone {
    public void showTime() {
        System.out.println("showing some times");
    }
    public void on(){
        System.out.println("Phone Turning on");
    }
}

class SmartPhone extends Phone{
    public void music() {
        System.out.println("Playing music");
    }
    public void on() { // this will override
        System.out.println("Smartphone is turning on");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Dynamic method dispatch is also known as run time polymorphism.
        // It is a technique in which a superclass reference variable refers to the object of the subclass.

        Phone nokia = new SmartPhone();
        nokia.on(); // will show smartphone (sub class) only if they have the same function
        // nokia.music(); // will not shoe sub class
        nokia.showTime();

    }
}