package pl.weeia.ferdynadf.PPKWU_zad1.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("api")
public class RevController {

    @GetMapping(value = "/rev")
    public String reverseString(@RequestParam(name ="string", defaultValue = "HelloWorld") String givenString){
        return StringUtils.reverse(givenString);
    }

}
