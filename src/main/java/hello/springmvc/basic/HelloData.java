package hello.springmvc.basic;

import lombok.Data;

@Data
// @Data 적용 시키면 , getter, setter, tostring, EqualsAndHashCode, RequiredArgsConstructor 를 자동으로 적용시켜준다.
public class HelloData {
    private String username;
    private int age;
}
