import java.util.*;
import java.io.*;

class Employee
{
  public static void main(String[] args)
  {
    int User_Choice=1000,i=0;
    Vector<Integer> E_ID=new Vector <>();
    Scanner scan=new Scanner(System.in);
    System.out.printf("\nPlease enter the number of Employees you want to add\nType here: ");
    int Employees=scan.nextInt();
    if (Employees<=0)
    {
      System.out.print("Invalid Entry!!! ");
      System.exit(0);
    }
    while(i<Employees)
    {
      System.out.printf("\nPlease enter the Employee ID\nType here: ");
      int id=scan.nextInt();
      Integer ID = Integer.valueOf(id);
      E_ID.add(ID);
      i+=1;
    }
    Collections.sort(E_ID);
    while(User_Choice!=0) // While loop allows one to use the program as many times as they want to without needing to execute the program again
    {
      System.out.printf("\nList of Functions :\n 0: To exit \n 1: To add an Employee's Details \n 2: To delete any account detail \n 3: To display all Employee details \n \n Type here: ");
      User_Choice=scan.nextInt();
      switch(User_Choice)
      {
        case 0:
        System.out.printf("\nThank You for your time!!\n");
        break;
        case 1:
        System.out.printf("\nPlease enter the Employee ID\nType here: ");
        int id=scan.nextInt();
        Integer ID = Integer.valueOf(id);
        E_ID.add(ID);
        Collections.sort(E_ID);
        break;
        case 2:
        break;
        case 3:
        System.out.printf("\n| ");
        Iterator<Integer> iterate=E_ID.iterator();
        while(iterate.hasNext())
        {
          System.out.print(iterate.next());
          System.out.printf(" | ");
        }
        System.out.printf("\n");
        break;
        default:
        System.out.printf("\nInvalid number entered!!\n"); //To prevent erroneous input form the user
        break;
      }
    }

    // E_ID.add(2000);
    // E_ID.add(4000);
    // E_ID.add(6000);
    // E_ID.add(5000);
    // Collections.sort(E_ID);
    // Iterator<Integer> iterate=E_ID.iterator();
    //
    // System.out.print("| ");
    // while(iterate.hasNext())
    // {
    //   System.out.printf(iterate.next());
    //   System.out.printf(" | ");
    // }
  }
}
