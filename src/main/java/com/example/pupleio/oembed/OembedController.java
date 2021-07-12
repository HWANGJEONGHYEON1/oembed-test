package com.example.pupleio.oembed;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OembedController {

    private final OembedService embedService;

    public OembedController(OembedService embedService) {
        this.embedService = embedService;
    }

    @GetMapping(value = "/api/social/oembed",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public OEmbedDTO socialEmbed(@RequestParam String url) {
        return embedService.oEmbedProcess(url);
    }
}
