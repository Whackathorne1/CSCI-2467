

//public class Main {
//
//    public static void main(String[] args) {

//        int x = (10 + 45);
//        String FirstName = "Wyatt";
//        String LastName = "Hackathorne";
//        int hour = 11;
//        int minute = 34;
//
//        System.out.println("The main character said \"Hello world\".");
//        System.out.println("What is 25 + 30? ");
//        System.out.println("bee boop bop = " +x+ "");
//        System.out.println("Hello, what's your name?");
//        System.out.println("Hello, my name is " + FirstName );
//        System.out.println("Last name?");
//        System.out.print( LastName );
//        System.out.println(", Hey do you have the time?");
//        System.out.println("Yeah, " +hour+ ":" +minute+ ".");
//        System.out.println("Thank you, have a nice day");
//        System.out.print("The second character said \"Goodbye,");
//        System.out.println(" cruel world.\"");

    //program to display my birthday in American format and European
//        String day = "Friday";
//        int date = 23;
//        String month = "March";
//        int year = 2001;
//        System.out.println("American format: ");
//        System.out.println( "" + day + ", "+ month +" "+ date+ ", "+ year );
//        System.out.println("European format: ");
//        System.out.println(""+ day +" "+ date +" "+ month +" "+ year);

    //program to tell me how many seconds til midnight
//        int SecondsInADay = 86400;
//        int hour = 12;
//        int HourInSeconds = hour *(60 * 60);
//        int minute = 38;
//        int MinuteInSeconds = minute * 60;
//        int SecondsPassed = MinuteInSeconds + HourInSeconds;
//        int seconds = 0;
//        double PercentOfTheDay = (SecondsPassed * 100.0) / SecondsInADay;
//        int SecondsTilMidnight = SecondsInADay - (SecondsPassed);
//        double PercentLeftInDay = (SecondsTilMidnight * 100.0) / SecondsInADay;
//        System.out.println("Seconds until midnight: " + SecondsTilMidnight);
//        System.out.println("Percentage of the day that has passed: %"+ PercentOfTheDay );
//        System.out.println("Percentage left in the day: %"+ PercentLeftInDay);

    //program that calculates cm to in
//        int inch = 100;
//        final double CM_PER_INCH = 2.54;
//        double cm = inch * CM_PER_INCH;
//        double cent = 254.0;
//        double INCH_PER_CM = (int) (cm / CM_PER_INCH);
//        System.out.printf("%d in = %.2f cm\n", inch, cm);
//        System.out.printf("%.4f cm = %d in\n", cent, inch);

    //test program
    //final double FIFTHS_THIRDS = 5.0/3.0;
    //System.out.printf("Five thirds = %.2f", FIFTHS_THIRDS);

    //converts centimeters to feet and inches

//        double cm;
//        int feet, inches, remainder;
//        final double CM_PER_INCH = 2.54;
//        final int IN_PER_FOOT = 12;
//        Scanner in = new Scanner(System.in);
//
//        //prompt the user and get the value
//        System.out.print("exactly how man cm? ");
//        cm = in.nextDouble();
//
//        //Convert and output result
//
//        inches = (int) (cm / CM_PER_INCH);
//        feet = inches / IN_PER_FOOT;
//        remainder = inches % IN_PER_FOOT;
//        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);

    //Program to convert C to F
//        Scanner in = new Scanner(System.in);
//
//        double centi;
//        double far;
//
//        System.out.print(" Please enter temperature in celsius: ");
//        centi = in.nextInt();
//        far = centi * 9/5 + 32;
//        System.out.printf("%.1f = C %.1f = F\n ", centi, far);

    //program to take seconds and convert into hours, minutes and seconds
//        Scanner in = new Scanner(System.in);
//
//        int Seconds;
//
//        System.out.print("Please enter amount of second to be converted: ");
//        Seconds = in.nextInt();
//
//        int hours = (Seconds / (60 * 60));
//        int HoursInMinutes = hours *60;
//        int minutes =  (Seconds / 60 - HoursInMinutes );
//        int remainder = (Seconds % 60);
//
//        System.out.printf("%d= Seconds %d= Hours %d= Minutes %d= Seconds", Seconds, hours, minutes, remainder);

    //Program to guess "random" number

//        Scanner in = new Scanner(System.in);
//
//        int remainder = 0;
//        int guess;
//        int GuessMyNumber = 14;
//
//        System.out.print("Please guess a number from 1-100: ");
//        guess = in.nextInt();
//
//        remainder = GuessMyNumber - guess;
//
//        if (remainder != 0)
//        {
//
//            System.out.println("You were off by " + Math.abs(remainder));
//        }
//
//        if (remainder == 0)
//            {
//
//                System.out.println("YOU GUESSED IT RIGHT!!!");
//            }

    //try and guess random number between 1-100

//     public static void main(String[]args)
//        {
//            Scanner in = new Scanner(System.in);
//            Random random = new Random();
//            int response;
//            int remainder = 0;
//            int number = random.nextInt(100) + 1;
//            int guess;
//
//            System.out.print("Please guess a number between 1-100: ");
//            guess = in.nextInt();
//
//            remainder = number - guess;
//
//            if (remainder != 0) {
//                System.out.println("You were off by " + Math.abs(remainder));
//                System.out.println("Would you like to play again? 1 for yes, 2 for no");
//                response = in.nextInt();
//                if (response == 1) {
//                    main();
//                }
//            }
//
//            if (remainder == 0) {
//                System.out.println("YOU GUESSED IT RIGHT!!!");
//                System.out.println("Would you like to play again? 1 for yes, 2 for no");
//                response = in.nextInt();
//                if (response == 1) {
//                    TestRedo();
//                }
//            }
//        }
//     }
            //practice method program
//            private static void printTwice(String s) {
//                System.out.println(s);
//                System.out.println(s);
//            }
//            public static void main(String[] args) {
//                printTwice("Don't make me say this twice!");
//            }

    //practice reading program
//    private static void zoop() {
//        baffle();
//        System.out.print("You wugga ");
//        baffle();
//    }
//
//
//    public static void main(String[] args) {
//        System.out.print("No, I ");
//        zoop();
//        System.out.print("I ");
//        baffle();
//    }
//
//
//    private static void baffle() {
//        System.out.print("wug");
//        ping();
//    }
//
//
//    private static void ping() {
//        System.out.println(".");

// example of methods being called
public class Main
    {


        public static void zoop() {
            baffle();
            System.out.print("You wugga ");
            baffle();
        }

        public static void main(String[] args) {
            System.out.print("No, I ");
            zoop();
            System.out.print("I ");
            baffle();
        }


        public static void baffle() {
            System.out.print("wug");
            ping();
        }

        public static void ping() {
            System.out.println(".");
        }
    }





















