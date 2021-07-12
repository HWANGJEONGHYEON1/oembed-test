package com.example.pupleio.oembed.url;

public class YoutubeUrl implements SiteUrl {

    private final static String YOUTUBE_URL = "https://www.youtube.com/oembed?url=";
    private final static String YOUTUBE_NAME = "youtube";
    @Override
    public String getDomainName() {
        return YOUTUBE_URL;
    }

    @Override
    public String getName() {
        return YOUTUBE_NAME;
    }
}
