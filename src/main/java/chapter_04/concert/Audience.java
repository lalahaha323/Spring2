package chapter_04.concert;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect//该注解表明Audience不仅仅是一个POJO，还是一个切面
public class Audience {
    @Pointcut("execution(* chapter_04.concert.Performance.perform(..))")
    public void performance() {}
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP!!!");
        } catch(Throwable e) {
            System.out.println("Demanding a refund");
        }
    }
}