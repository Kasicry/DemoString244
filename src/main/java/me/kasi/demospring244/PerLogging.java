package me.kasi.demospring244;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.CLASS) //이 어노테이션 정보를 얼마나유지할것인가? 예시) 클래스까지 유지하겠다 라는 뜻
public @interface PerLogging {
}
