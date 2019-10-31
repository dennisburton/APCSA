public class Unit3Lesson3 {
   public static void main( String[] args ){
      System.out.println("Blastoise Values at Level 100");
      System.out.println("HP:\t\t\t\t\t" + getHpValueAtLevel100( HP ) );
      System.out.println("Attack:\t\t\t\t" + getNonHpValueAtLevel100( ATTACK ) );
      System.out.println("Defense:\t\t\t\t" + getNonHpValueAtLevel100( DEFENSE ) );
      System.out.println("Special Attack:\t" + getNonHpValueAtLevel100( SPECIAL_ATTACK ) );
      System.out.println("Special Defense:\t" + getNonHpValueAtLevel100( SPECIAL_DEFENSE ) );
      System.out.println("Speed:\t\t\t\t" + getNonHpValueAtLevel100( SPEED ) );
      
      Angulator a = new Angulator();
      System.out.println("Angle " + a.getRelativeAngle( 310, 10 ) );
}
      
   // Base stats for Blastoise 
   public static final int HP = 79;                     
   public static final int ATTACK = 83;             
   public static final int DEFENSE = 100;                        
   public static final int SPECIAL_ATTACK = 85;                        
   public static final int SPECIAL_DEFENSE = 105;
   public static final int SPEED = 78;

   /*
   A level 100 Pokémon's stats in Attack, Defense, Speed, Special Attack, and Special Defense 
   will be exactly 5 more than double its base stat values in each (leaving out 
   individual values, effort values, and nature).

   The Hit Points (HP) stat will be 110 plus double the base stat value 
   (except in the case of Shedinja, whose HP is always 1).
   */

   public static int getNonHpValueAtLevel100( int baseValue ){
      return (2 * baseValue) + 5;
   }
   
   public static int getHpValueAtLevel100( int baseValue ){
      return 110 + (2*baseValue);
   }
   
   


}