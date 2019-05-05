package chapter_04.concert;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//这个类的四个方法都使用注解来定义切面的具体行为
@Aspect//该注解表明Audience不仅仅是一个POJO，还是一个切面
public class Audience {
    @Before("execution(* chapter_04.concert.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }
    @Before("execution(* chapter_04.concert.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }
    @AfterReturning("execution(* chapter_04.concert.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }
    @AfterThrowing("execution(* chapter_04.concert.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
