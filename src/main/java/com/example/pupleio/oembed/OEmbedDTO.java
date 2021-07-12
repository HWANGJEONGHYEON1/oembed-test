package com.example.pupleio.oembed;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OEmbedDTO {
    private String type;
    private String version;
    private String provider_name;
    private String title;
    private String author_name;
    private String author_url;
    private int is_plus;
    private String account_type;
    private String html;

    private int width;
    private int height;
    private int duration;
    private String description;

    private String thumbnail_url;
    private int thumbnail_width;
    private int thumbnail_height;
    private String thumbnail_url_with_play_button;
    private String  upload_date;
    private Long video_id;
    private String uri;
}
