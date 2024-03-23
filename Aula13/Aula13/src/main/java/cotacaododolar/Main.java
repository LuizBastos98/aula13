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

package cotacaododolar;
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
        
        System.out.println("Qual o valor do dolar? ");
        double dolar = ler.nextDouble();
        
        System.out.println("Quantos dolar voce quer? ");
        double valor = ler.nextDouble();
        
        System.out.printf("valor em reais : %.2f", CurrencyConverter.converter(dolar, valor));    

    }
}