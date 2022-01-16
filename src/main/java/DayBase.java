import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class DayBase {

    abstract String challenge1();
    abstract String challenge2();


    void run1(){
        long startTime = System.nanoTime();
        System.out.println(challenge1());
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("time: " + duration/1000000 +"ms");
    }

    void run2(){
        long startTime = System.nanoTime();
        System.out.println(challenge2());
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("time: " + duration/1000000 +"ms");
    }

    void runAll(){
        run1();
        run2();
    }

    String[] parseInput(String input){
        return input.split("\n");
    }

}
