package javaPack;

import java.time.Clock;

/**
 * Created by Administrator on 2018/4/12.
 */
public class TestException {
    public static int test1(){
        int ret = 0;
        try {
            return ret;
        }finally {
            ret = 2;
        }
    }

    public static int test2(){
        int ret = 0;
        try {
            int a = 5 / 0 ;
            return ret;
        }finally {
            return 2;
        }
    }
    public static int test3(){

        try {
            int a = 5 / 0;
        }finally {

            throw new RuntimeException("hello");
        }

    }

    public static void main(String[] args) {


        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
    }
}
