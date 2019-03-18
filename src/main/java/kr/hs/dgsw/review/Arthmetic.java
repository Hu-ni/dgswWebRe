package kr.hs.dgsw.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Arthmetic {

    @GetMapping("/result")
    public String Result(String value){
        return value;
    }

}
