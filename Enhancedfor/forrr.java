package Enhancedfor;

public class forrr {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10}; //menentukan nilai dari Variable nums
        int sum = 0; //Value sum
        for(int a:nums){ //untuk menentukan untuk setiap nums akan di pindahkan ke variable a
            System.out.println(a);  //Untuk menunjukkan hasil dari a yang sudah di pindahkan dari nums
            sum += a; //Vatiable sum nanti di tambahkan sebanyak a untuk setiap perulangan sampai selesai atau mencapai Bracket
        }
        System.out.println(sum); //Untuk mengeluatkan hasil dari perjumlahan perulangan variable sum
        }
}
