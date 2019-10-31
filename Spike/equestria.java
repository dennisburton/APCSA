public class equestria{
   public static final int BALTIMARE_X = 29;
   public static final int BALTIMARE_Y = 16;
   
   public static final int MANEHATTEN_X = 34;
   public static final int MANEHATTEN_Y = 8;
   
   public static final int LOS_PEGASUS_X = 6;
   public static final int LOS_PEGASUS_Y = 19;
   
   public static final int NEIGHAGRA_FALLS_X = 22;
   public static final int NEIGHAGRA_FALLS_Y = 7;
   
   public static final int BADLANDS_X = 25;
   public static final int BADLANDS_Y = 24;
   
   public static final int PONYVILLE_X = 16;
   public static final int PONYVILLE_Y = 14;


   public static void main(String[] args){
     
      System.out.println(" The distance from Baltimare to Manehattan " + distance(BALTIMARE_X,BALTIMARE_Y,MANEHATTEN_X,MANEHATTEN_Y) );
      System.out.println(" The distance from Los Pegasus to Neighagra Falls " + distance(LOS_PEGASUS_X,LOS_PEGASUS_Y,NEIGHAGRA_FALLS_X,NEIGHAGRA_FALLS_Y) );
      System.out.println(" The distance from Badlands to Ponyville " + distance(BADLANDS_X,BADLANDS_Y,PONYVILLE_X,PONYVILLE_Y) );

   }

   
   public static double distance(double x1, double y1, double x2, double y2){
     return Math.hypot((x2-x1),(y2-y1));
   } 
   
}