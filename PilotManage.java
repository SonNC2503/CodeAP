
package asmAp;

import java.util.ArrayList;
import java.util.*;

public class PilotManage extends ManagerEmployee {
    private static Scanner sc = new Scanner(System.in);
    private ArrayList<Pilot> pilotList = new ArrayList<Pilot>();

    @Override
    public void add() {
        try{
            System.out.println("Add Pilot Information");
            String id = inputID();
            for(int i = 0; i < pilotList.size(); i++){
                if(pilotList.get(i).getId().equalsIgnoreCase(id)){
                    System.out.println("        Pilot already exists!       ");
                    System.out.println("-------------------------------------");
                    return;
                }
            }
            try{
                String name = inputName();
                String DoB = inputDOB();
                String gender = inputGender();
                String address = inputAddress();
                int phone = inputPhone();
                String flightExperience = inputFlightExperience();
                String position = inputPosition();
                
                Pilot pilot = new Pilot(id, name, DoB, gender, address, phone, flightExperience, position);
                pilotList.add(pilot);
                System.out.println("*******************************");
                System.out.println("Add new Pilot successfully!");
            }catch(NumberFormatException e){
                System.out.println("Please enter the correct information!");
            }
        }catch(Exception e){
            System.out.println("Failed action!");
        }
    }

    @Override
    public void show() {
        System.out.println("                      Pilot List                    ");
        System.out.println("--------------------------o0o--------------------------");
        for(Pilot pilot : pilotList){
            System.out.println("    Pilot ID                : " + pilot.getId());
            System.out.println("    Pilot Name              : " + pilot.getName());
            System.out.println("    Pilot DoB               : " + pilot.getDob());
            System.out.println("    Pilot Gender            : " + pilot.getGender());
            System.out.println("    Pilot Address           : " + pilot.getAddress());
            System.out.println("    Pilot Phone             : " + pilot.getPhone());
            System.out.println("    Pilot Flight Experience : " + pilot.getFlightExperience());
            System.out.println("    Pilot Position          : " + pilot.getPosition());
            System.out.println("==============================================================");
            System.out.println("");
            
        }
    }

    @Override
    public void edit() {
        String a = selectID();
        for(int i = 0; i < pilotList.size(); i++){
            if(pilotList.get(i).getId().equalsIgnoreCase(a)){
                System.out.println("Edit Pilot Information");
                try{
                    pilotList.get(i).setName(inputName());
                    pilotList.get(i).setDob(inputDOB());
                    pilotList.get(i).setGender(inputGender());
                    pilotList.get(i).setAddress(inputAddress());
                    pilotList.get(i).setPhone(inputPhone());
                    pilotList.get(i).setFlightExperience(inputFlightExperience());
                    pilotList.get(i).setPosition(inputPosition());
                }catch(NumberFormatException e){
                    System.out.println("Please enter the correct information!");
                    return;
                }
                System.out.println("Update Pilot's information successfully!");
                System.out.println("=============================================================");
                return;
            }
        }
        System.out.println("Pilot doesn't exist!!");
        System.out.println("================================================================");
    }

    @Override
    public void delete() {
        String a = selectID();
        for(int i = 0; i < pilotList.size(); i++){
            if(pilotList.get(i).getId().equalsIgnoreCase(a)){
                Pilot pilot = pilotList.get(i);
                pilotList.remove(pilot);
                System.out.println("Delete Pilot Successfully!");
                System.out.println("==============================================");
                return;
            }
        }
        System.out.println("Pilot doesn't exist!!");
        System.out.println("====================================================");
    }

    @Override
    public void search() {
        String a = selectID();
        for(int i = 0; i < pilotList.size(); i++){
            if(pilotList.get(i).getId().equalsIgnoreCase(a)){
                System.out.println("    Pilot ID                : " + pilotList.get(i).getId());
                System.out.println("    Pilot Name              : " + pilotList.get(i).getName());
                System.out.println("    Pilot DoB               : " + pilotList.get(i).getDob());
                System.out.println("    Pilot Gender            : " + pilotList.get(i).getGender());
                System.out.println("    Pilot Address           : " + pilotList.get(i).getAddress());
                System.out.println("    Pilot Phone             : " + pilotList.get(i).getPhone());
                System.out.println("    Pilot Flight Experience : " + pilotList.get(i).getFlightExperience());
                System.out.println("    Pilot Position          : " + pilotList.get(i).getPosition());
                return;
            }
        }
        System.out.println("Pilot doesn't exist!!");
        System.out.println("====================================================");
    }
    
    public void pilotMenu(){
        System.out.println("    Pilot Management System");
        System.out.println("--------------------------------");
        System.out.println("    1. Show list of Pilot");
        System.out.println("    2. Add new Pilot");
        System.out.println("    3. Update the Pilot");
        System.out.println("    4. Delete the Pilot");
        System.out.println("    5. Search for the Pilot");
        System.out.println("    6. Back to Main Menu");
        System.out.println("");
    }
    public String inputFlightExperience(){
        System.out.print("Input Flight Experience: ");
        return sc.nextLine();
    }
    public String inputPosition(){
        System.out.print("Input Position: ");
        return sc.nextLine();
    }
}



