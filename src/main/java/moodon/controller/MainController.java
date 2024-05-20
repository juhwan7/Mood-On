package moodon.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {

    @GetMapping(value = "/")
    public String main() {

        return "메인 로딩 성공";
    }

    @GetMapping(value = "/{number}")
    public String test(@PathVariable("number") String number) {

        return number;
    }
}
