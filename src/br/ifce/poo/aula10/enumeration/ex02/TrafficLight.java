package br.ifce.poo.aula10.enumeration.ex02;

public enum TrafficLight
{    
   // declare constants of enum type                                
   RED( 50 ), // light is red for 50 seconds
   GREEN( 40 ), // light is green for 40 seconds
   YELLOW( 5 ); // light is yellow for 5 seconds

   // instance fields 
   private final int duration; // duration of the light

   // enum type constructor
   TrafficLight( int durationSeconds ) 
   { 
      duration = durationSeconds;
   } // end enum constructor TrafficLight

   // accessor for duration
   public int getDuration()
   {
      return duration;
   } // end method getDuration
} // end enum TrafficLight


