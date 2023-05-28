package com.website.kakao.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class kakaoController {

    @GetMapping("/kakaomap")
    public String showKakaoMap() {
        return "kakaomap";
    }
}
