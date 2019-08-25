public class Stewie2 {
   public static void main( String [] args ){
      printFullMessage();
      printMessageNoHeader();
      printMessageNoHeader();
      printMessageNoHeader();
      printMessageNoHeader();
   }
   
   public static void printHeader(){
      System.out.println("//////////////////////");
   }
   
   public static void printMessage(){
      System.out.println("|| Victory is mine! ||");
   }
   
   public static void printFooter(){
      System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
   }
   
   public static void printFullMessage(){
      printHeader();
      printMessage();
      printFooter();
   }
   
   public static void printMessageNoHeader(){
      printMessage();
      printFooter();
   }
}