package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorejavaApplicationTests {

    @Test
    public void contextLoads() {

        // sout(4);
        int i = 3;
        int j = i << 3;
        System.out.println(j);
    }

    public void sout(int a) {
        switch (a) {

            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");
        }
    }

    @Test
    public void qiangzhaun() {
        short s1 = 1;
        //   s1 = (short) (s1+1);

//        s1+=1;

        char s = '我';

    }

    @Test
    public void name() {
        String s = "hello";
        s = s + "world";

        System.out.println(s);
    }
}
