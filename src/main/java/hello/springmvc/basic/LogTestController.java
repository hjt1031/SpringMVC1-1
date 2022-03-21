package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());
    // @Slf4j (lombok) 을 사용하면 private final Logger log = LoggerFactory.getLogger(getClass()); 안써도됨

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        // 레벨 낮은 순 부터
        // default 는 info 부터
        // log.trace("trace log={} + name); + 연산을 사용하면 자바 문법상 먼저 계산하고 갖고 있기때문에 리소스 낭비.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
/**
 * @RestController 는 return 값 이 반환자로 되지만
 * @Controller 는 return 뷰 이름이 반환된다.
 */
