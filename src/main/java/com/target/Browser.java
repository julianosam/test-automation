package com.target;

public class Browser {

    public static void goTo(String url) {
        Drivers.get().get(url);
    }

    public static String getTitle() {
        return Drivers.get().getTitle();
    }

    public static void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
