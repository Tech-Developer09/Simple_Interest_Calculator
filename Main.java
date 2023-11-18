import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to calculate?");
        System.out.print("Enter 'S' for Simple Interest, 'P' for Principal amount, 'R' for Rate and 'T' for Time : ");
        String input = sc.next();
        char inp = input.charAt(0);

        if (inp == 'S' || inp == 's') {
            System.out.print("Enter Principal amount (INR) : ");
            float amount = sc.nextFloat();
            System.out.print("Enter Rate (% per annum) : ");
            float rate = sc.nextFloat();
            System.out.println("Enter time according to Days/Weeks/Months/Years");
            System.out.print("Enter (D/W/M/Y) : ");
            String input_time = sc.next();
            char inp_time = input_time.charAt(0);

            if (inp_time == 'D' || inp_time == 'd') {
                System.out.print("Enter number of days : ");
                float time_d = sc.nextFloat();
                int year = 365;
                float time = time_d / year;
                // System.out.println(time);
                float interest = (amount * rate * time) / 100;
                System.out.println("Simple Interest : Rs. " + interest);
            }
            else if (inp_time == 'W' || inp_time == 'w') {
                System.out.print("Enter number of weeks : ");
                float time_w = sc.nextFloat();
                float year = 52.1429f;
                float time = time_w / year;
                // System.out.println(time);
                float interest = (amount * rate * time) / 100;
                System.out.println("Simple Interest : Rs. " + interest);
            }
            else if (inp_time == 'M' || inp_time == 'm') {
                System.out.print("Enter number of months : ");
                float time_m = sc.nextFloat();
                int year = 12;
                float time = time_m / year;
                // System.out.println(time);
                float interest = (amount * rate * time) / 100;
                System.out.println("Simple Interest : Rs. " + interest);
            }
            else if (inp_time == 'Y' || inp_time == 'y') {
                System.out.print("Enter number of years : ");
                float time = sc.nextFloat();
                // System.out.println(time);
                float interest = (amount * rate * time) / 100;
                System.out.println("Simple Interest : Rs. " + interest);
            }
            else {
                System.out.println("Invalid Input...");
            }
        }
        else if (inp == 'P' || inp == 'p') {
            System.out.print("Enter Simple Interest : ");
            float interest = sc.nextFloat();
            System.out.print("Enter Rate (% per annum) : ");
            float rate = sc.nextFloat();
            System.out.println("Enter time according to Days/Weeks/Months/Years");
            System.out.print("Enter (D/W/M/Y) : ");
            String input_time = sc.next();
            char inp_time = input_time.charAt(0);

            if (inp_time == 'D' || inp_time == 'd') {
                System.out.print("Enter number of days : ");
                float time_d = sc.nextFloat();
                int year = 365;
                float time = time_d / year;
                // System.out.println(time);
                float amount = (interest * 100) / (rate * time);
                System.out.println("Principal Amount : Rs. " + amount);
            }
            else if (inp_time == 'W' || inp_time == 'w') {
                System.out.print("Enter number of weeks : ");
                float time_w = sc.nextFloat();
                float year = 52.1429f;
                float time = time_w / year;
                // System.out.println(time);
                float amount = (interest * 100) / (rate * time);
                System.out.println("Principal Amount : Rs. " + amount);
            }
            else if (inp_time == 'M' || inp_time == 'm') {
                System.out.print("Enter number of months : ");
                float time_m = sc.nextFloat();
                int year = 12;
                float time = time_m / year;
                // System.out.println(time);
                float amount = (interest * 100) / (rate * time);
                System.out.println("Principal Amount : Rs. " + amount);
            }
            else if (inp_time == 'Y' || inp_time == 'y') {
                System.out.print("Enter number of years : ");
                float time = sc.nextFloat();
                // System.out.println(time);
                float amount = (interest * 100) / (rate * time);
                System.out.println("Principal Amount : Rs. " + amount);
            }
            else {
                System.out.println("Invalid Input...");
            }
        }
        else if (inp == 'R' || inp == 'r') {
            System.out.print("Enter Simple Interest : ");
            float interest = sc.nextFloat();
            System.out.print("Enter Principal amount (INR) : ");
            float amount = sc.nextFloat();
            System.out.println("Enter time according to Days/Weeks/Months/Years");
            System.out.print("Enter (D/W/M/Y) : ");
            String input_time = sc.next();
            char inp_time = input_time.charAt(0);

            if (inp_time == 'D' || inp_time == 'd') {
                System.out.print("Enter number of days : ");
                float time_d = sc.nextFloat();
                int year = 365;
                float time = time_d / year;
                // System.out.println(time);
                float rate = (interest * 100) / (amount * time);
                System.out.println("Rate per annum : Rs. " + rate);
            }
            else if (inp_time == 'W' || inp_time == 'w') {
                System.out.print("Enter number of weeks : ");
                float time_w = sc.nextFloat();
                float year = 52.1429f;
                float time = time_w / year;
                // System.out.println(time);
                float rate = (interest * 100) / (amount * time);
                System.out.println("Rate per annum : Rs. " + rate);
            }
            else if (inp_time == 'M' || inp_time == 'm') {
                System.out.print("Enter number of months : ");
                float time_m = sc.nextFloat();
                int year = 12;
                float time = time_m / year;
                // System.out.println(time);
                float rate = (interest * 100) / (amount * time);
                System.out.println("Rate per annum : Rs. " + rate);
            }
            else if (inp_time == 'Y' || inp_time == 'y') {
                System.out.print("Enter number of years : ");
                float time = sc.nextFloat();
                // System.out.println(time);
                float rate = (interest * 100) / (amount * time);
                System.out.println("Rate per annum : Rs. " + rate);
            }
            else {
                System.out.println("Invalid Input...");
            }
        }
        else if (inp == 'T' || inp == 't') {
            System.out.print("Enter Simple Interest : ");
            float interest = sc.nextFloat();
            System.out.print("Enter Principal amount (INR) : ");
            float amount = sc.nextFloat();
            System.out.print("Enter Rate (% per annum) : ");
            float rate = sc.nextFloat();

            float time = (interest * 100) / (amount * rate);
            System.out.println("Time : " + time + " years");
        }
        else {
            System.out.println("Invalid Input...");
        }
    }
}