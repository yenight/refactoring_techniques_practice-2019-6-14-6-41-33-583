package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    @Test
    public void should_return_IE_on_Mac_when_platform_is_Mac_and_browser_is_IE() {
        //given
        BannerRender bannerRender = new BannerRender();
        //when
        String result = bannerRender.renderBanner("Mac", "IE");
        //then
        assertEquals("IE on Mac?", result);
    }

    @Test
    public void should_return_IE_on_Mac_when_platform_is_Window_and_browser_is_FireFox() {
        //given
        BannerRender bannerRender = new BannerRender();
        //when
        String result = bannerRender.renderBanner("Window", "FireFox");
        //then
        assertEquals("banner", result);
    }

}