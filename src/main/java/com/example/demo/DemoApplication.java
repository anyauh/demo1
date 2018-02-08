package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		int i = 0 ;
        System.out.println("i++"+i++);//0
        System.out.println("++i"+ ++i);//2
        Integer mn = new Integer(0);
        int m = 0 ;
        int n = 0 ;
        System.out.println(m == n);


        Integer nm = new Integer(0) ;
        System.out.println(mn == nm);

        System.out.println(m == mn);
        System.out.println(n == mn);

        int xyz = 0x2f ;

        int xy = 1&1 ;
        int xy1 = 1&0 ;

        System.out.println(xy);
        System.out.println(xy1);



    }



}