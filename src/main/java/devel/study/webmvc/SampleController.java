package devel.study.webmvc;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    //headers = header에 특정 key가 있는 경우만 처리
    @GetMapping(value = "/hello", consumes = MediaType.APPLICATION_JSON_VALUE, headers = HttpHeaders.AUTHORIZATION)
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
