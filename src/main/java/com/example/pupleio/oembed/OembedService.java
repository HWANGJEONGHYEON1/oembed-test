package com.example.pupleio.oembed;

import com.example.pupleio.oembed.url.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class OembedService {
    private RestTemplate restTemplate = new RestTemplate();

    private List<SiteUrl> urlList = Arrays.asList(
                    new YoutubeUrl(),
                    new TwitterUrl(),
                    new InstagramUrl(),
                    new VimeoUrl());

    private String getUrl(String url) {
        final String oembedUrl = urlList.stream()
                .filter(domain -> url.contains(domain.getName()))
                .findFirst()
                .map(SiteUrl::getDomainName)
                .orElseThrow(() -> new IllegalArgumentException("해당 요청 url을 처리할 수 없습니다."));

        return oembedUrl.concat(url);
    }

    public OEmbedDTO oEmbedProcess(String url) {
        return restTemplate.getForObject(getUrl(url), OEmbedDTO.class);
    }
}
