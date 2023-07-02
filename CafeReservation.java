import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args){
        //Deklarasi Variable
        String name, gender, day, result;
        int age;
        double appearance, money;

        Scanner input = new Scanner(System.in);

        // Inisialisasi Variable
        result ="";

        //Teks untuk Inputan User

        /*

        Name
        Age
        Gender
        Appearance
        Money
        Day

        */

        System.out.println("Wellcome to Cafe 79 Reservation");

        System.out.println("Please Insert your name! :");
        name = input.nextLine();
        
        System.out.println("How old are you! :");
        age = input.nextInt();

        System.out.println("What's your gender! :");
        gender = input.next();

        System.out.println("Please Insert your appearance! :");
        appearance = input.nextDouble();

        System.out.println("How much your money! :");
        money = input.nextDouble();

        System.out.println("Choose your day! :");
        day = input.next();

        // Membuat kondisi If untuk setiap Reservation Day

        if(day.equalsIgnoreCase("Monday")){

// Buat If untuk mengecekan apakah sesuai untuk Monday
        if( age >= 20 && age <= 30 && money >=500){
            result = "Reservation Succesfully, you can order, Young Night.";
        } else{
            result = "Sorry, You can't order on monday, because it's for Young Night.";
            }
        } 
        else if(day.equalsIgnoreCase("Tuesday")){
// Buat If untuk mengecekan apakah sesuai untuk Tuesday
        if( age >= 30 && age <= 50 && money >=250){
            result = "Reservation Succesfully, you can order, Oldest Night.";
        } else{
            result = "Sorry, You can't order on Tuesday, because it's for Oldest Night.";
            }
        }
        else if(day.equalsIgnoreCase("Wednesday")){
// Buat If untuk mengecekan apakah sesuai untuk Wednesday
        if( gender.equalsIgnoreCase("Female") && age >= 20 && age <= 35 && appearance >= 8 && money >=300){
            result = "Reservation Succesfully, you can order, Ladies Night.";
        } else{
            result = "Sorry, You can't order on Wednesday, because it's for Ladies Night.";
            }
        }
        else if(day.equalsIgnoreCase("Thursday")){
// Buat If untuk mengecekan apakah sesuai untuk Thursday
        if( gender.equalsIgnoreCase("Female") && age >= 21 && age <= 30 && appearance >= 8 && money >=300 ||  gender.equalsIgnoreCase("Male") && age >= 21 && age <= 30 && money >=1000){
            result = "Reservation Succesfully, you can order, Party Night For Single.";
        } else{
        result = "Sorry, You can't order on Thursday, because it's for Party Night For Single.";
            }
        }
        else if(day.equalsIgnoreCase("Friday")){
 // Buat If untuk mengecekan apakah sesuai untuk Friday
 if( gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && money >=1000 ||  gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25 && appearance >= 8){
    result = "Reservation Succesfully, you can order, Women Night";
} else{
result = "Sorry, You can't order on Friday, because it's for Women Night.";
    }
}
        else if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
 // Buat If untuk mengecekan apakah sesuai untuk Weekend
        if( age >= 18 && age <= 60 && money >= 100){
            result = "Reservation Succesfully, you can order, Weekend Freedom.";
        } else{
            result = "Sorry, You can't order on Weekend, because it's for Weekend Freedom.";
            }
        }

        // Output Text hasil aplikasi
        System.out.println();
        System.out.println("Hi " + name + " Thank you for using our App.");
        System.out.println();
        System.out.println("Following result for your reservation: ");
        System.out.println(result);



        
    }
}
