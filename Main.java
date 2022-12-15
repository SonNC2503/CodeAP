package asmAp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        FlightAttendantManage faFunction = new FlightAttendantManage();
        PilotManage pilotFunction = new PilotManage();
        int mainchoice = 0;
        Mainmenu: do{
            mainmenu();
            mainchoice = selectChoice();
            System.out.println("");
            switch(mainchoice){
                case 1:
                    faFunction.flightAttendantMenu();
                    int faChoice = selectChoice();
                    System.out.println("");
                    switch(faChoice){
                        case 1:
                            faFunction.show();
                            System.out.println("");
                            break;
                        case 2:
                            faFunction.add();
                            System.out.println("");
                            break;
                        case 3:
                            faFunction.edit();
                            System.out.println("");
                            break;
                        case 4:
                            faFunction.delete();
                            System.out.println("");
                            break;
                        case 5:
                            faFunction.search();
                            System.out.println("");
                            break;
                        case 6:
                            System.out.println("");
                            continue Mainmenu;
                        default:
                            message();
                            break; 
                    }
                    break;
                case 2:
                    pilotFunction.pilotMenu();
                    int pilotChoice = selectChoice();
                    System.out.println("");
                    switch(pilotChoice){
                        case 1:
                            pilotFunction.show();
                            System.out.println("");
                            break;
                        case 2:
                            pilotFunction.add();
                            System.out.println("");
                            break;
                        case 3:
                            pilotFunction.edit();
                            System.out.println("");
                            break;
                        case 4:
                            pilotFunction.delete();
                            System.out.println("");
                            break;
                        case 5:
                            pilotFunction.search();
                            System.out.println("");
                            break;
                        case 6:
                            System.out.println("");
                            continue Mainmenu;
                        default:
                            message();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("See You!");
                    return;
                default:
                    message();
                    break; 
            }
        }while(mainchoice != 3);
    }
    
    public static void mainmenu(){
        System.out.println("        Employee Management System");
        System.out.println("*******************************************");
        System.out.println("    1. Flight Attendant Management");
        System.out.println("    2. Pilot Management");
        System.out.println("    3. Exit");
        System.out.println("");
    }
    public static int selectChoice(){
        boolean check = true;
        int choice = 0;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                System.out.println("please enter the number of the function!");
                sc.nextLine();
            }
        } while (check);
        return choice;
    }
    public static void message(){
        System.out.println("Please enter the correct information!");
        System.out.println("----------------------------------------");
        System.out.println("");
    }
}
