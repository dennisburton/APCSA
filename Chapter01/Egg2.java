public class Egg2 {
   public static void main( String [] args ){
      printEggTop();
      printEggBottom();
      printEggCenter();
      printEggTop();
      printEggBottom();
      printEggCenter();
      printEggBottom();
      printEggTop();
      printEggCenter();
      printEggBottom();
   }
   
   public static void printEggTop(){
      System.out.println("  -------");
      System.out.println(" /       \\");
      System.out.println("/         \\");   
   }

   public static void printEggCenter(){
      System.out.println("-\"-'-\"-'-\"-");
   }

   public static void printEggBottom(){
      System.out.println("\\         /");
      System.out.println(" \\       /");
      System.out.println("  -------");
   }
}