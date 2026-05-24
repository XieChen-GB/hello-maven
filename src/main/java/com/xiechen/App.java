package com.xiechen;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(fmt));
    }
}
