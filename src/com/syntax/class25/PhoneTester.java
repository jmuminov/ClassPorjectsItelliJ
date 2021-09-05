package com.syntax.class25;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone = new Iphone();
        phone.makePhoneCall();
        phone.sendSMS();
        phone.takePictures();
        phone.unlock();

    }
}
