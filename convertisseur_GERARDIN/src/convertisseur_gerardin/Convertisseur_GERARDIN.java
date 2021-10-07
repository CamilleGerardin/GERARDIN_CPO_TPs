/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_gerardin;

import java.util.Scanner;

/**
 *
 * @author camille
 */
public class Convertisseur_GERARDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une valeur :");
        double valeur ;
        valeur =sc.nextFloat();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Farenheit vers Celcius \n4) De Celcius vers Farenheit \n5) De Kelvin vers Farenheit \n6) De Farenheit vers Kelvin");
        int conversion; 
        conversion = sc.nextInt();
        double result;
        
        switch(conversion) {
            case 1  : 
                result = CelciusVersKelvin(valeur);
                System.out.println(valeur + " degré Celcius est égal à " + result + " degrés Kelvin");
                break;
            case 2 : 
                result = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degré Kelvin est égal à " + result + " degrés Celcius");
                break;
            case 3 :
                result = FarenheitVersCelcius(valeur);
                System.out.println(valeur + " degré Farenheit est égal à " + result + " degrés Celcius");
                break;
            case 4 :
                result = CelciusVersFarenheit(valeur);
                System.out.println(valeur + " degré Celcius est égal à " + result + " degrés Farenheit");
                break;
            case 5 :
                result = KelvinVersFarenheit(valeur);
                System.out.println(valeur + " degré Kelvin est égal à " + result + " degrés Farenheit");
                break;
            case 6 : 
                result = FarenheitVersKelvin(valeur);
                System.out.println(valeur + " degré Farenheit est égal à " + result + " degrés Kelvin");
        }
    }
public static double CelciusVersKelvin ( double valeur) {
    double result = valeur + 273.15;
    return (double) result;
}
 public static double KelvinVersCelcius (double valeur) {
    double result = valeur - 273.15;
    return (double) result; 
}
 public static double FarenheitVersCelcius (double valeur) {
    double result = (valeur - 32)/1.8;
    return (double) result;
}
 public static double CelciusVersFarenheit (double valeur) {
    double result = valeur * 1.8 + 32;
    return (double) result;
}
 public static double KelvinVersFarenheit (double valeur) {
    double result = KelvinVersCelcius(valeur);
    double result2 = CelciusVersFarenheit(result);
    return (double) result2;
}
 public static double FarenheitVersKelvin (double valeur) {
    double result= FarenheitVersCelcius(valeur);
    double result2 = CelciusVersKelvin(result);
    return (double) result2;
}
}
