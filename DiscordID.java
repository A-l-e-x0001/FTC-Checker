import java.util.*;
public class DiscordID
{
   public static void main(String args[])
   {
      Scanner myObj = new Scanner(System.in);
      System.out.println("People that got FTC'd this week:");
      String AllIDs = myObj.nextLine();
      System.out.println("People that got FTC'd last week:");
      String AllIDs2 = myObj.nextLine();
      char Start = '<';
      char End = '>';
      System.out.println(math.CountIDs(AllIDs, Start));
      String[] DiscordIDs = math.makeArray(AllIDs,Start,End);
      String[] DiscordIDs2 = math.makeArray(AllIDs2,Start,End);
      System.out.println(DiscordIDs.length);
      String[] NotShow = new String[50];
      int y = 0;
      boolean found = false;
      System.out.println("2x FTC");
      for (String nums : DiscordIDs){
         found = false;
         for (int x = 0; x<DiscordIDs2.length;x++){
            if (DiscordIDs2[x].equals(nums)){
               System.out.println(nums);
               found = true;
            }
         }
         if (found == false){
            NotShow[y] = nums;
            y++;
         }
            
      }  
      System.out.println("\n\n 1x FTC \n");
      for (String print : NotShow){
         if (print != null)
            System.out.println(print);
      }
   }
   
}

class math
{
   public static String[] makeArray(String IDs,char start,char end){
      int temp = 0;
      int count2 = 0;
      int count3 = 0;
      String[] Answer = new String[CountIDs(IDs,start)];
      for (int x=0;x<IDs.length(); x++){
         if (IDs.charAt(x) == start){
         temp = x;
         }
         if (IDs.charAt(x) == end){
            Answer[count3] = IDs.substring(temp, x+1);
            count3++;
         }
      }
      return Answer;
   }
   public static int CountIDs(String IDs, char start){
      int x = 0;
      for (int bum=0;bum<IDs.length()-1;bum++){
         if (IDs.charAt(bum) == start){
            x++;
         }
      }
      return x;
   }
}


//Test IDs

//<@612378827141677158><@1109326906999980123><@797256180685996054><@1074424257867698216><@721255708401729596><@999192703881461880><@871080915336589354><@1005285326018846861><@1106308421906599956><@757377696685883404><@815365017927024653><@475553261982842881><@533440950320627732><@1053517903330287686><@417798704192552962><@812069034991550485><@991860532422377482><@431992392288043028><@796887078192676885><@1039630666939244614><@947741182270783488><@786677925335400488><@808850239418793994><@805336104014184459>
//<@612378827141677158><@1109326906999980123><@797256180685996054><@1074424257867698216><@721255708401729596><@999192703881461880><@871080915336589354><@1005285326018846861><@1106308421906599956><@757377696685883404><@815365017927024653><@475553261982842881><@533440950320627732><@1053517903330287686><@417798704192552962><@812069034991550485><@991860532422377482><@431992392288043028><@796887078192676885><@1039630666939244614><@947741182270783488><@786677925335400488><@808850239418793994><@805336104014184459>
