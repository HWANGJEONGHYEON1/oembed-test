package com.example.pupleio.oembed.url;

public class VimeoUrl implements SiteUrl {
    private final static String VIMEO_URL = "https://vimeo.com/api/oembed.json?url=";
    private final static String VIMEO_NAME = "vimeo";
    @Override
    public String getDomainName() {
        return VIMEO_URL;
    }

    @Override
    public String getName() {
        return VIMEO_NAME;
    }
}
