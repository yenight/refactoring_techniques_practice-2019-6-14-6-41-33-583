package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        final boolean doesPlatformContainMac = platform.toUpperCase().contains("MAC");
        final boolean doesBrowserContainIE = browser.toUpperCase().contains("IE");
        return  doesPlatformContainMac && doesBrowserContainIE ? "IE on Mac?" : "banner";
    }
}
