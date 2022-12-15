/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asmAp;

import java.util.ArrayList;
import java.util.*;


public class FlightAttendantManage extends ManagerEmployee{
    private static Scanner sc = new Scanner(System.in);
    private ArrayList<FlightAttendant> faList = new ArrayList<FlightAttendant>();

    @Override
    public void add() {
        try {
            System.out.println("Add Flight Attendant Information");
            String id = inputID();
            for (int i = 0; i < faList.size(); i++) {
                if (faList.get(i).getId().equalsIgnoreCase(id)) {
                    System.out.println("ID already exists!");
                    System.out.println("-----------------------------------------------");
                    return;
                }
                
            }
            try {
                
                String name = inputName();
                String DoB = inputDOB();
                String gender = inputGender();
                String address = inputAddress();
                int phone = inputPhone();
                String salary = inputSalary();
                
                FlightAttendant fa = new FlightAttendant(id, name, DoB, gender, address, phone, salary);
                faList.add(fa);
                System.out.println("*******************************");
                System.out.println("Add new Flight Attendant successfully!");
            } catch(NumberFormatException e) {
                System.out.println("Please enter the correct information!");
            }
            
        } catch(Exception e) {
            System.out.println("Failed action!");
        }
        
    }

    @Override
    public void show() {
        System.out.println("                 Flight Attendant List                    ");
        System.out.println("--------------------------o0o--------------------------");
        for(FlightAttendant fa : faList){
            System.out.println("    Flight Attendant ID                : " + fa.getId());
            System.out.println("    Flight Attendant Name              : " + fa.getName());
            System.out.println("    Flight Attendant DoB               : " + fa.getDob());
            System.out.println("    Flight Attendant Gender            : " + fa.getGender());
            System.out.println("    Flight Attendant Address           : " + fa.getAddress());
            System.out.println("    Flight Attendant Phone             : " + fa.getPhone());
            System.out.println("    Flight Attendant Salary            : " + fa.getSalary());
            System.out.println("==============================================================");
            System.out.println("");
        }
    }

    @Override
    public void edit() {
       String a = selectID();
        for(int i = 0; i < faList.size(); i++){
            if(faList.get(i).getId().equalsIgnoreCase(a)){
                System.out.println("Edit Flight Attendant Information");
                try{
                    
                    faList.get(i).setName(inputName());
                    faList.get(i).setDob(inputDOB());
                    faList.get(i).setGender(inputGender());
                    faList.get(i).setAddress(inputAddress());
                    faList.get(i).setPhone(inputPhone());
                    faList.get(i).setSalary(inputSalary());
                }catch(NumberFormatException e){
                    System.out.println("Please enter the correct information!");
                    return;
                }
                System.out.println("Update Information Successfully!");
                System.out.println("=============================================================");
                return;
            }
        }
        System.out.println("Flight Attendant doesn't exist!!");
        System.out.println("================================================================"); 
    }

    @Override
    public void delete() {
        String a = selectID();
        for(int i = 0; i < faList.size(); i++){
            if(faList.get(i).getId().equalsIgnoreCase(a)){
                FlightAttendant fa = faList.get(i);
                faList.remove(fa);
                System.out.println("Delete Flight Attendant Successfully!");
                System.out.println("==============================================");
                return;
            }
        }
        System.out.println("Flight Attendant doesn't exist!!");
        System.out.println("====================================================");
    }

    @Override
    public void search() {
        String a = selectID();
        for(int i = 0; i < faList.size(); i++){
            if(faList.get(i).getId().equalsIgnoreCase(a)){
                System.out.println("    Flight Attendant ID                : " + faList.get(i).getId());
                System.out.println("    Flight Attendant Name              : " + faList.get(i).getName());
                System.out.println("    Flight Attendant DoB               : " + faList.get(i).getDob());
                System.out.println("    Flight Attendant Gender            : " + faList.get(i).getGender());
                System.out.println("    Flight Attendant Address           : " + faList.get(i).getAddress());
                System.out.println("    Flight Attendant Phone             : " + faList.get(i).getPhone());
                System.out.println("    Flight Attendant Salary            : " + faList.get(i).getSalary());
                return;
            }
        }
        System.out.println("Flight Attendant doesn't exist!!");
        System.out.println("====================================================");
    }
    
    public void flightAttendantMenu(){
        System.out.println("    Flight Attendant Management System");
        System.out.println("--------------------------------------------");
        System.out.println("    1. Show list of Flight Attendant");
        System.out.println("    2. Add new Flight Attendant");
        System.out.println("    3. Update the Flight Attendant");
        System.out.println("    4. Delete the Flight Attendant");
        System.out.println("    5. Search for the Flight Attendant");
        System.out.println("    6. Back to Main Menu");
        System.out.println("");
    }
    
    public String inputSalary(){
        System.out.print("Input salary: ");
        return sc.nextLine();
    }
}


