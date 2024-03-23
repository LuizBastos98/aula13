/*
 * Copyright (C) 2024 Luiz Bastos <luizfelipebastossantana@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package banco;
import java.util.Scanner;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @date 22/03/2024
 * @brief Class Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double value;
        int opcao1;
        
        Account account = new Account();
        
        System.out.print("Enter Account number: ");
        int number = ler.nextInt();
        account.setNumber(number);
        ler.nextLine();
        System.out.print("Enter Account holder: ");
        account.holder = ler.nextLine();
        System.out.print("Is There na initial deposit (y/n)?  ");
        String opcao = ler.next();
        
        
        
        if(opcao.equals("y")){
            
            System.out.print("Enter initial deposit value: ");
            value = ler.nextDouble();
            account.setValue(value);
        }else{
            value = 0;
            account.setValue(value);
        }
        
        System.out.println("Account data: \n" +account);
        do{
        System.out.println("What operation do you want to do?");
        System.out.println(" 1 - Deposit Value");
        System.out.println(" 2 - Withdraw Value");
        System.out.println(" 3 - Exit ");
        opcao1= ler.nextInt();
        
        if(opcao1 == 1){
            System.out.println("Deposit");
            
            System.out.print("Enter a Deposit value: ");
            value = ler.nextDouble();
            account.deposit(value);
            System.out.println("Update account data: /n" +account);
            
        }else if(opcao1 == 2){
            System.out.println("Withdraw");
            
            System.out.print("Enter a Withdraw value: ");
            value = ler.nextDouble();
            account.withdraw(value);
            System.out.println("Update account data: /n" +account);
            
        }else if(opcao1 != 1 ||opcao1 != 2 ||opcao1 != 3 ){
            System.out.println("Opçao invalida");
        }
        
        }while(opcao1 == 3);
    }
}