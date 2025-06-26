import java.util.Scanner;

public class bioData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*START OF PROGRAM
        asking data from the user*/

        System.out.println("\nHi User!\nPlease input the necessary data ; )\n");
        print("Enter your First Name: ");
        String firstName = scan.next();
        print("Enter your Last Name: ");
        String lastName = scan.next();
        print("Enter your Middle Name: ");
        String middleName = scan.next();
        print("Enter your mother First Name: ");
        String motherFname = scan.next();
        print("Enter your mother Last Name: ");
        String motherLname = scan.next();
        print("Enter your father First Name: ");
        String fatherFname = scan.next();
        print("Enter your father Last Name: ");
        String fatherLname = scan.next();

        System.out.println("\nWELCOME BACK " +firstName+ "!!!");
        print("Enter Age: ");
        int age = scan.nextInt();
        print("Enter Address: ");
        String address = scan.next();
        print("Enter birth Month: ");
        String birthMonth = scan.next();
        print("Enter birth Day: ");
        int birthDay = scan.nextInt();
        print("Enter birth Year: ");
        String birthYear = scan.next();

        //CALLED FUNCTION ZODIAC from line 78 to determine the Zodiac Sign of the User
        String zodiac = zodiac(birthMonth, birthDay); 
        print("Your Zodiac Sign is: " + zodiac);
        print("\ntype ( S ) if student, ( W ) if employee: ");
        String workOrSchool = scan.next().toLowerCase();

        // condition of the user is a student or a employee
        //user is a student
        if(workOrSchool.matches("s")){ 
            print("Enter School name: ");
            String schoolName = scan.next();
            print("What is your program at " +schoolName+ " ?: ");
            String program = scan.next();
            print("\n(a)-freshmen\n(b)-sophmore\n(c)-junior\n(d)-senior\nSelect letter of year level: ");
            String yearlvl = scan.next().toLowerCase();
            switch (yearlvl) {
                case "a":
                    yearlvl = "Freshmen";
                case "b":
                    yearlvl = "Freshmen";
                case "c":
                    yearlvl = "Freshmen";
                case "d":
                    yearlvl = "Freshmen";
            }
            print("What is your section name: ");
            String section = scan.next();

            print("\nYou're a " +yearlvl+ " studying " +program+ ", section " +section+ "at" +schoolName+ "\nNICE!!\n");
        }
        // user is a employee
        else{                                                      
            print("Enter current Job Title: ");
            String jobName = scan.next();
            print("Enter company name: ");
            String companyName = scan.next();
            print("\nYou're a " + jobName + "at " +companyName+ "\nNICE!!\n");
        }
        System.out.println("Last Question\nWhat is one thing you do for fun? ");
        String hobby = scan.next();

        // Function printall() is called to OUTPUT all the data.
        printall(firstName,lastName,motherFname,fatherFname,age,address,birthMonth,birthDay,birthYear,zodiac,hobby); 
    }
    // FUNCTION TO SHORTEN THE System.out.println() function
    public static void print(String x){
        System.out.print(x);
    }

    // FUNCTION TO DETERMIN THE ZODIAC SIGN OF USER
    public static String zodiac(String month, int day){
        String lowerCaseMonth = month.toLowerCase();
        System.out.println(lowerCaseMonth);
        if ((lowerCaseMonth.matches("march") || lowerCaseMonth.matches("april")) && ((day >= 21 && day <= 30) || (day >= 1 && day <= 19))){
            return "Aries";
        }
        else if ((lowerCaseMonth.matches("april") || lowerCaseMonth.matches("may")) && ((day >= 20 && day <= 30) || (day >= 1 && day <= 20))){
            return "Taurus";
        }
        else if ((lowerCaseMonth.matches("may") || lowerCaseMonth.matches("june")) && ((day >= 21 && day <= 30) || (day >= 1 && day <= 21))){
            return "Gemini";
        }
        else if ((lowerCaseMonth.matches("june")|| lowerCaseMonth.matches("july")) && ((day >= 22 && day <= 30) || (day >= 1 && day <= 22))){
            return "Cancer";
        }
        else if ((lowerCaseMonth.matches("july")|| lowerCaseMonth.matches("august")) && ((day >= 23 && day <= 30) || (day >= 1 && day <= 22))){
            return "Leo";
        }
        else if ((lowerCaseMonth.matches("august")|| lowerCaseMonth.matches("september")) && ((day >= 23 && day <= 30) || (day >= 1 && day <= 22))){
            return "Virgo";
        }
        else if ((lowerCaseMonth.matches("september")|| lowerCaseMonth.matches("october")) && ((day >= 23 && day <= 30) || (day >= 1 && day <= 23))){
            return "Libra";
        }
        else if ((lowerCaseMonth.matches("october") || lowerCaseMonth.matches("november")) && ((day >= 24 && day <= 30) || (day >= 1 && day <= 21))){
            return "Scorpio";
        }
        else if ((lowerCaseMonth.matches("november")|| lowerCaseMonth.matches("december")) && ((day >= 22 && day <= 30) || (day >= 1 && day <= 21))){
            return "Sagittarius";
        }
        else if ((lowerCaseMonth.matches("december")|| lowerCaseMonth.matches("january")) && ((day >= 22 && day <= 31) || (day >= 1 && day <= 19))){
            return "Capricorn";
        }
        else if ((lowerCaseMonth.matches("january")|| lowerCaseMonth.matches("february")) && ((day >= 20 && day <= 30) || (day >= 1 && day <= 18))){
            return "Aquarius";
        }
        else{
            return "Pisces";
        }
    }

    //FUNTION TO OUTPUT ALL DATA
    public static void printall(String userFname,String userLname,String motherFname,String fatherFname,int age,String address,String birthM,int birthD,String birthY,String zodiac,String hobby){
        System.out.println("\nBIO DATA!\nMy name is " +userFname+ " "+userLname+", " +age+ " years old from "+address+ ", I like to " +hobby+ " and my birthday is " +birthM+", " +birthD+ " of " +birthY+ " my zodiac sign is " +zodiac+",\nson/daughter of " +motherFname+ " and " +fatherFname+".");
    }
}