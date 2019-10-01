package pl.weeia.ferdynadf.PPKWU_zad1.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zadanie1 {

    @GetMapping(value = "/rev")
    public String reverseString(@RequestParam(name ="string") String givenString){
        return StringUtils.reverse(givenString);
    }
}
