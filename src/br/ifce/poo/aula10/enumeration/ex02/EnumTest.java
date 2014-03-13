package br.ifce.poo.aula10.enumeration.ex02;


public class EnumTest 
{
   public static void main( String args[] ) 
   {
      System.out.println( "Light\tDuration\n" );

      // print all traffic lights and their duration                                       
      for ( TrafficLight light : TrafficLight.values() )          
         System.out.printf( "%s\t%d\n", light, light.getDuration() );
   }
}

