package com.example.pupleio.oembed.url;

public class InstagramUrl implements SiteUrl {
    private final static String INSTAGRAM_URL = "https://api.instagram.com/oembed?url=";
    private final static String INSTAGRAM_NAME = "instagram";

    @Override
    public String getDomainName() {
        return INSTAGRAM_URL;
    }

    @Override
    public String getName() {
        return INSTAGRAM_NAME;
    }
}
