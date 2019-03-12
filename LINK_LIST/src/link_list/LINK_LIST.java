/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list;

import java.util.Scanner;

/**
 *
 * @author ITCLANBD
 */
public class LINK_LIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner abir = new Scanner(System.in);
        MyOrderList abir1 = new MyOrderList();
        System.out.println("Enter what do you want?");
        System.out.println("=============================START FROM HERE===============================================================");
        System.out.println("Enter 1 for inserting number");
        System.out.println("Enter 2 for your search number");
        System.out.println("Enter 3 for deleting the cursor number");
        System.out.println("Enter 4 for deleting the own given number");
        System.out.println("Enter 5 for CLEAR the number number");
        System.out.println("Enter 6 for checking empty or not");
        System.out.println("Enter 7 for push to cursor top");
        System.out.println("Enter 8 for push to cursor bottom");
        System.out.println("Enter 9 for getting next poition of cursor");
        System.out.println("Enter 10 for getting previous position of cursor");
        System.out.println("Enter 11 for getting exact cursor position");
        System.out.println("Enter 12 for show the linked list");
        int first = abir.nextInt();
        switch (first) {
            case 1:
                System.out.println("Enter your desire adding number");
                int x = abir.nextInt();
                abir1.insert(new Node(x, null));
                break;
            case 2:
                System.out.println("Enter your search number");
                int x1 = abir.nextInt();
                abir1.retrieve(x1);
                break;
            case 3:
                abir1.remove();
                break;
            case 4:
                System.out.println("Enter desire number for deleting the number number");
                int x2 = abir.nextInt();
                abir1.remove(x2);
                break;
            case 5:
                abir1.clear();
                break;
            case 6:
                abir1.isEmpty();
                break;
            case 7:
                abir1.gotoBeginning();
                break;
            case 8:
                abir1.gotoEnd();
                break;
            case 9:
                abir1.gotoNext();
                break;
            case 10:
                abir1.gotoPrior();
                break;
            case 11:
                abir1.getCursor();
                break;
            case 12:
                abir1.showList();
                break;
            default:
                System.out.println("atleast akbar valo input dite hbe...");
        }

        System.out.println("IF YOU WANT TO CONTINUE THAN PRESS Y");
        String s = abir.next();
        if (s.equalsIgnoreCase("y")) {
            while (true) {
                System.out.println("Enter 1for inserting number");
                System.out.println("Enter 2 for your search number");
                System.out.println("Enter 3 for deleting the cursor number");
                System.out.println("Enter 4 for deleting the own given number");
                System.out.println("Enter 5 for CLEAR the number number");
                System.out.println("Enter 6 for checking empty or not");
                System.out.println("Enter 7 for push to cursor top");
                System.out.println("Enter 8 for push to cursor bottom");
                System.out.println("Enter 9 for getting next poition of cursor");
                System.out.println("Enter 10 for getting previous position of cursor");
                System.out.println("Enter 11 for getting exact cursor position");
                System.out.println("Enter 12 for show the linked list");
                try {
                    int ask = abir.nextInt();
                    switch (ask) {
                        case 1:
                            System.out.println("Enter your inserting number");
                            int x = abir.nextInt();
                            abir1.insert(new Node(x, null));
                            break;
                        case 2:
                            System.out.println("Enter your search number");
                            int x1 = abir.nextInt();
                            abir1.retrieve(x1);
                            break;
                        case 3:
                            abir1.remove();
                            break;
                        case 4:
                            System.out.println("Enter desire number for deleting the number number");
                            int x2 = abir.nextInt();
                            abir1.remove(x2);
                            break;
                        case 5:
                            abir1.clear();
                            break;
                        case 6:
                            abir1.isEmpty();
                            break;
                        case 7:
                            abir1.gotoBeginning();
                            break;
                        case 8:
                            abir1.gotoEnd();
                            break;
                        case 9:
                            abir1.gotoNext();
                            break;
                        case 10:
                            abir1.gotoPrior();
                            break;
                        case 11:
                            abir1.getCursor();
                            break;
                        case 12:
                            abir1.showList();
                            break;
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("hoise r kto pormu..:p");
                    }
                } catch (Exception e) {
                    System.out.println("Please follow the instructions");
                }
            }
        }
    }

}
