package com.freeinfo.mediaw.mediawapp.connector;

import com.freeinfo.mediaw.mediawapp.model.MediaAvabilityDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="mediawrold", url = "${client.mediaworld.base_url}")
public interface MediaWorldFeignClient {

    @GetMapping("{itemCode}/{cordinate}")
    MediaAvabilityDTO searchOnLocation(
            @PathVariable("itemCode") String itemCode,
            @PathVariable("cordinate") String cordinate
    );
}
