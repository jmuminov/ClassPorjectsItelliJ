package com.syntax.class25;

public abstract class Phone {
    public void makePhoneCall() {
        System.out.println("Calling");
    }
    public void sendSMS() {
        System.out.println("Sending a message");
    }
    public abstract void takePictures();
    public abstract void unlock();
}
class Iphone extends Phone {
    @Override
    public void takePictures() {
        System.out.println("Take pictures with 12Mega pixel camera");
    }
    public void unlock() {
        System.out.println("unlock with faceID");
    }
}
class Samsung extends Phone {
    public void takePictures() {
        System.out.println("Take pictures with 108Megapixels camera");
    }
    public void unlock() {
        System.out.println("unlock with fingerprint");
    }
}
