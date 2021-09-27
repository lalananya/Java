interface Notification{ // interface
    void notifyUser();
}

public class FactoryMethod { // Factory class
    public Notification createNotification(String channel){ // return type is Notification, it must return a result of that type
        if(channel == null) return null;
        else if(channel == "SMS") return new SMS();
        else if(channel == "Push") return new Push();
        else if(channel == "Custom") return new Custom();
        return null;
    }
}


class SMS implements Notification{ // as this implemented interface Notification , above factory methods works
    @Override
    public void notifyUser(){ // when you don't use public : Error : Cannot reduce the visibility of the inherited method from Notification
        System.out.println("SMS notifier");
    }
}

class Push implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Push notifier");
    }
}

class Custom implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Custom notifier");
    }
}

/* Now we just need to call from a mid point */

class NotificationService{ // this needs to execute
    public static void main(String []args) {
        FactoryMethod obj = new FactoryMethod();
        obj.createNotification("SMS").notifyUser();
        obj.createNotification("Push").notifyUser();
        obj.createNotification("Custom").notifyUser();   // Here an object of different class can also be passed for more specifications 
    }
}