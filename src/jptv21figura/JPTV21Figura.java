/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21figura;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер функции: ");
            System.out.println("0. Закончить приложение.");
            System.out.println("1. Закрашенный прямоугольник");
            System.out.println("2. Пустой прямоугольник");
            System.out.println("3. Закрашенный треугольник");
            System.out.println("4. Пустой треугольник");
            System.out.println("Введите выборочное число:  ");
            int numberFunction = scanner.nextInt();
            switch (numberFunction) {
            case 0:
                System.out.println("Спасибо тебе!!");
                break;
            case 1:
                System.out.println("Вы выбрали функцию \"1. Закрашенный прямоугольник\"");
                    for(int i=0; i<10; i++){ 
                        for(int j=0; j<10; j++){
		System.out.print("*  ");
                }
            System.out.println();
            }
                break;
            case 2:
                System.out.println("Вы выбрали функцию:  \"2. Пустой прямоугольник\"");
                
                break;
                
            case 3:
                System.out.println("Вы выбрали функцию 3");
                String s = "*";
                    for(int i =0; i<25; i++)
                    {
                        System.out.println(s);
                        s = s + "*";
                    }
                break;
                
                
            
        // TODO code application logic here
                /*}*/
    
            /*}*/
