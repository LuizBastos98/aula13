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

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @date 22/03/2024
 * @brief Class Account
 */
public class Account {
    
    private static final double taxa = 5;
    private int number;
    public String holder;
    private double value;     
    
    public int  getNumber(){
        return number;
    }
    
    public double getValue(){
        return value;
    }
    
    public void setNumber(int number){
    this.number = number;
    }
    
    public void setValue(double value){
    this.value = value;
    }
    
    public void deposit(double value){
    this.value += value;    
    }
    
    public void withdraw(double value){
        if((value + taxa) > this.value){
            System.out.println("Indisponivel/ valor de saque maior que o saldo");
        }else{
    this.value -= value + taxa;
        }    
    }
    
    
    @Override
    public String toString(){
        return "Account " + getNumber() +", Holder: " + holder + String.format(" $%.2f",getValue());
    }
}