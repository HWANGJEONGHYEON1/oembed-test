package com.example.pupleio.oembed;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Objects;

@SpringBootTest
class OembedControllerTest {

    @Autowired
    private OembedController controller;

    @ParameterizedTest
    @ValueSource(strings = {"https://vimeo.com/20097015", "https://twitter.com/hellopolicy/status/867177144815804416",
    "https://www.instagram.com/p/BUawPlPF_Rx", "https://www.youtube.com/watch?v=dBD54EZIrZo"})
    @DisplayName("컨트롤러 dto 데이터확인")
    void oembedApiTest(String url) {
        final OEmbedDTO oEmbedDTO = controller.socialEmbed(url);
        Assertions.assertThat(Objects.isNull(oEmbedDTO)).isFalse();
        Assertions.assertThat(oEmbedDTO.getIs_plus()).isEqualTo(0);
    }


}