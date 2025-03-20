package me.kasi.demospring244;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParseException;
import org.springframework.expression.ParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("#{1+1}") // #은 SpEL 표현식을 참고하는방법
    int value;

    @Value("#{'hello' + 'world'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOfFalse;

    @Value("hello")
    String hello;

    @Value("${spring.application.name}") //$는 프로퍼티를 참고하는방법
    String name;

    @Value("${my.value}") //$는 프로퍼티를 참고하는방법
    int myValue;

    @Value("#{${my.value} eq 100}")
    boolean myValue2;

    @Value("#{sample.data}")
    int sampleData;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===================");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOfFalse);
        System.out.println(hello);
        System.out.println(name);
        System.out.println(myValue2);
        System.out.println(sampleData);

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("2+100");
        Integer value = expression.getValue(Integer.class);
        System.out.println(value);

    }


}
