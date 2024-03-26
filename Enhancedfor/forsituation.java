package Enhancedfor;

public class forsituation {
        public static void main(String[] args) {
            int numbers = 1;
    
            // Mencoba untuk mengubah numbers menggunakan for each
            for (int number : numbers) { //For each tidak dapat bekerja
                number = number * 2; 
            }
            for (int number : numbers) {
                System.out.println(number); 
            }
        }
    }
//Hal tersebut disebabkan oleh For each hanya dapat digunakan untuk menghitung array, sedangkan tanpa array lebih efisien menggunakan for basic

