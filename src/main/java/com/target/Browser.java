package com.target;

public class Browser {

    public static void goTo(String url) {
        Drivers.get().get(url);
    }

    public static String getTitle() {
        return Drivers.get().getTitle();
    }

}
