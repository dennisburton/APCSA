public class Angulator {
   public static void main( String [] args ){
      double endingAngle = 10;
      double startingAngle = 0;   
   /*
      showResult( startingAngle, endingAngle );
      
      endingAngle = 0;
      startingAngle = 10;
      showResult( startingAngle, endingAngle );
      
      startingAngle = -10;
      endingAngle = -45;
      showResult( startingAngle, endingAngle );
      
      startingAngle = -45;
      endingAngle = -10;
      showResult( startingAngle, endingAngle );
      
      startingAngle = 10;
      endingAngle = 350;
      showResult( startingAngle, endingAngle );
      
      startingAngle = 350;
      endingAngle = 10;
      showResult( startingAngle, endingAngle );
*/
   }
   
   private void showResult( double startingAngle, double endingAngle ){
      double relativeAngle = getRelativeAngle( startingAngle, endingAngle );
      String summary = String.format("Angle %.2f is %.2f degrees from %.2f", endingAngle, relativeAngle, startingAngle );
      System.out.println( summary ); 
   }
   
   public double getRelativeAngle( double startingAngle, double endingAngle ){
      double offset = endingAngle - startingAngle;
     
      if( offset > 180 ){
         return offset - 360;
      
      }else if( offset < -180 ){
         return offset + 360;
      }
      return offset;
   }
}