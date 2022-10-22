import java.util.Scanner;

public class ConversorDeTemperaturaFinal {
    static Scanner entrada = new Scanner(System.in);
    // converte Celcius em Fahrenheit
    static double celciusFahrenheit(double quant){
        double res = (quant * 9/5) + 32;
        return res;
    }
    // converte Celcius em Kelvin
    static double celsiusKelvin(double quant){
        double res = quant + 273.15;
        return res;
    }

    // converte Fahrenheit em Celcius
    static double fahrenheitCelsius(double quant){
        double res = (quant - 32) * 5/9;
        return res;
    }
    // converte Fahrenheit em Kelvin
    static double fahrenheitKelvin(double quant){
        double res = (quant - 32) * 5/9 + 273.15;
        return res;
    }

    // converte Kelvin em Celsius
    static double kelvinCelsius(double quant){
        double res = quant - 273.15;
        return res;
    }
    // converte Kelvin em Fahrenheit

    static double kelvinFahrenheit(double quant){
        double res = (quant - 273.15) * 9/5 + 32;
        return res;
    }

    static double media(double valor){
        return valor / 2;
    }

    public static void main(String[] args){
        double mediaEntrada = 0;
        double mediaSaida = 0;

        System.out.println("Quantidade de temperatura? ");
        double quant = entrada.nextDouble();

        System.out.println("Conversor de Temperatura\n" +
                "1. Celcius para Fahrenheit\n" +
                "2. Celcius para Kelvin\n"+
                "3. Fahrenheit para Celcius\n" +
                "4. Fahrenheit para Kelvin\n"+
                "5. Kelvin para Celcius\n" +
                "6. Kelvin para Fahrenheit\n" +
                "7. Sair");
        int cont = 0;
        do{
            System.out.println("\nEntre com a opção: ");
            int opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Entrada: " + quant + "ºC Celcius");
                    System.out.println("Saída: " + celciusFahrenheit(quant) + "ºF Fahrenheit");
                    break;
                case 2:
                    System.out.println("Entrada: " + quant + "ºC Celcius");
                    System.out.println("Saída: " + celsiusKelvin(quant) + "ºK Kelvin");
                    break;
                case 3:
                    System.out.println("Entrada: " + quant + "ºF Fahrenheit");
                    System.out.println("Saída: " + fahrenheitCelsius(quant) + "ºC Celcius");
                    break;
                case 4:
                    System.out.println("Entrada: " + quant + "ºF Fahrenheit");
                    System.out.println("Saída: " + fahrenheitKelvin(quant) + "ºK Kelvin");
                    break;
                case 5:
                    System.out.println("Entrada: " + quant + "ºK Kelvin");
                    System.out.println("Saída: " + kelvinCelsius(quant) + "ºC Celcius");
                    break;
                case 6:
                    System.out.println("Entrada: " + quant + "ºK Kelvin");
                    System.out.println("Saída: " + kelvinFahrenheit(quant) + "ºF Fahrenheit");
                    break;
                case 7:
                    break;
                default: System.out.println("Entrada Invalida");
            }
            mediaEntrada += quant;
            mediaSaida += celciusFahrenheit(quant);
            cont++;
        }while(cont < 2);
        System.out.println("Media das temperaturas de entrada: " + media(mediaEntrada));
        System.out.println("Media das temperaturas transformadas: " + media(mediaSaida));
    }
}
