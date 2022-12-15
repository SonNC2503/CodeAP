
package asmAp;
import java.util.Scanner;
public abstract class ManagerEmployee {
    private static Scanner sc = new Scanner(System.in);
    public abstract void add();
    public abstract void show();
    public abstract void edit();
    public abstract void delete();
    public abstract void search();
    public String selectID(){
        System.out.print("Enter employee ID: ");
        return sc.nextLine();
    }
    public String inputID(){
        System.out.print("Input ID: ");
        return sc.nextLine();  
    }
    public String inputName(){
        System.out.print("Input Name: ");
        return sc.nextLine();
    }
    public String inputDOB(){
        System.out.print("Input Date Of Birth: ");
        return sc.nextLine();
    }
    public String inputGender(){
        System.out.print("Input Gender: ");
        return sc.nextLine();
    }
    public String inputAddress(){
        System.out.print("Input Address: ");
        return sc.nextLine();
    }
    public int inputPhone(){
        System.out.print("Input Phone Number: ");
        return sc.nextInt();
    }
}



