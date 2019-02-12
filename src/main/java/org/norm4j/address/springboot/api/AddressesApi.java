package org.norm4j.address.springboot.api;

import lombok.extern.slf4j.Slf4j;
import org.norm4j.address.springboot.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class AddressesApi {

    /**
     * Research API
     * @param research : the request from the user
     * @return Return all addresses matched with the user request
     */
    @GetMapping("/addresses")
    public List<Address> find(@RequestParam("research") String research){
        log.info("Search for an address");
        log.debug("Following request params : {}", research);
        return List.of(new Address());
    }

}
