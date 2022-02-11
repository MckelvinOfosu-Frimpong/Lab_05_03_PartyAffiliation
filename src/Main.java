public class Main {

    public static void main(String[] args)
    {
	String partyAffil = "r"; //[D,R,I]

     if (partyAffil.equalsIgnoreCase("D") )
     {
         System.out.println("You get a democratic donkey");
     }
     else if (partyAffil.equalsIgnoreCase("R") )
     {
         System.out.println("You get a republican Elephant");
     }
     else if (partyAffil.equalsIgnoreCase("I") )
     {
         System.out.println("You get an independent person");
     }
     else
     {
         System.out.println("Other");
     }
    }
}
