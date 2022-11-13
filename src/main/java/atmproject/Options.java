package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    public void checkingOperations(){
        do{
            optionMessages();
            int option = input.nextInt();
            if(option == 4){
                break;
            }
            switch (option) {
                case 1:
                    System.out.println("Your checking balance is: "+moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("invalid option, please select 1, 2, 3 or 4");
            }
        }while (true);
    }
    public void savingOperations(){
        do {
            optionMessages();
            int option = input.nextInt();
            if(option == 4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("Your saving balance is: "+moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("invalid option, please select 1, 2, 3 or 4");
            }
        }while (true);
    }
    public void optionMessages(){
        System.out.println("Select Option:");
        System.out.println("1: View the balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
    }






}
