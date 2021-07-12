package com.example.pupleio.oembed.url;

public class TwitterUrl implements SiteUrl {

    private final static String TWITTER_URL = "https://publish.twitter.com/oembed?url=";
    private final static String TWITTER_NAME = "twitter";

    @Override
    public String getDomainName() {
        return TWITTER_URL;
    }

    @Override
    public String getName() {
        return TWITTER_NAME;
    }
}
