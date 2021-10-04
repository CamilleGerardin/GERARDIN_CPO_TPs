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
        double temperatureC ; 
        System.out.println("Entrer une temperature en Celsius :");
        temperatureC=sc.nextFloat();
        double temperatureK;
        temperatureK = CelciusVersKelvin (temperatureC);
        temperatureC = KelvinVersCelcius (temperatureK);
        System.out.println("la temperature en Kelvin est :" + temperatureK);
        double temperatureF;
    }
public static double CelciusVersKelvin (double temperatureC) {
    double temperatureK = temperatureC + 273.15;
    return (double) temperatureK;
}
 public static double KelvinVersCelcius (double temperatureK) {
    double temperatureC = temperatureK - 273.15;
    return (double) temperatureC; 
}
 public static double FarenheitVersCelcius (double temperatureF) {
    double temperatureC = (temperatureF - 32)/1.8;
    return (double) temperatureC;
}
 public static double CelciusVersFarenheit (double temperatureC) {
    double temperatureF = temperatureC * 1.8 + 32;
    return (double) temperatureF;
}
 public static double KelvinVersFarenheit (double temperatureK) {
    double temperatureC = KelvinVersCelcius(temperatureK);
    double temperatureF = CelciusVersFarenheit(temperatureC);
    return (double) temperatureF;
}
 public static double FarenheitVersKelvin (double temperatureF) {
    double temperatureC = FarenheitVersCelcius(temperatureF);
    double temperatureK = CelciusVersKelvin(temperatureC);
    return (double) temperatureK;
}
}
