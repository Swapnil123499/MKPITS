package com.mkpit.stringtask;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       StringBuffer sb=new StringBuffer();
      // Scanner scanner=new Scanner(System.in);
       
       sb.append("swapnil vinod jounjalkar");
       System.out.println(sb);
       StringBuffer sb1=new StringBuffer();
      sb1.append(sb.substring(0, sb.indexOf(" ")));
      sb1.reverse();
     // System.out.println(sb1);
        //sb1.reverse();
        //System.out.println(sb1);
        StringBuffer sb2=new StringBuffer();
        sb2.append(sb.substring(sb.indexOf(" ")+1,sb.lastIndexOf(" ")));
        sb2.reverse();
      //  System.out.println(sb2);
        //gfjhjkn
        StringBuffer sb3=new StringBuffer();
        sb3.append(sb.substring(sb.lastIndexOf(" ")+1,sb.lastIndexOf("r")+1));
        sb3.reverse();
      //  System.out.println(sb3);
      StringBuffer buffer=new StringBuffer();
        buffer.append(sb1+" "+sb2+" "+sb3);
        System.out.print(buffer);
        
    }
}
