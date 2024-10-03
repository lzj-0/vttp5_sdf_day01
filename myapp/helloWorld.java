package myapp;

import java.io.Console;
import java.util.*;


public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Console cons = System.console();
        String name = cons.readLine("What is your name? ");
        
        if (name.length() > 0) {
            System.out.println("Your name is " + name);
        } else {
            System.err.println("You have not told me your name");
        }

        String sport = cons.readLine("What is the sport that you like to do? ");

        if (sport.toUpperCase().equals("SWIMMING")) {
            System.out.println("That's a nice water sports");
        } else if (sport.toUpperCase().equals("SOCCER")) {
            System.out.println("It's a worldy accepted sports");
        } else {
            System.out.println("I am not sure about the sports you like.");
        }

        String replacedName = name.replace('a', 'e');
        System.out.printf("your name ... %s \n", replacedName);

        Integer score = Integer.parseInt(cons.readLine("Enter your score between 0 to 100: "));

        switch (score) {
            case 100:
                System.out.println("Perfect score");
                break;
            case 90:
                System.out.println("You score A");
                break;
            default:
                System.out.println("Not acceptable");
        }

        int i = 0;
        while (i < score) {
            System.out.print(i + ", ");
            i++;
        }

        do {
            System.out.println(i + ", ");
            i++;
        } while (i < score);

        Integer[] numbers = new Integer[5];

        for (int j = 0; j < numbers.length; j++) {
            Integer inputNumber = Integer.parseInt(cons.readLine("Enter your %s number: ", j));
            numbers[j] = inputNumber;
        }

        for (Integer num: numbers) {
            System.out.println(num);
        }

        if (args.length > 0) {
            String[] names = new String[5];

            int x = 0;
            while (x < args.length) {
                names[x] = args[x];
                x++;
                if (x > 4) {
                    break;
                }
            }

            for (int j = 0; j < names.length; j++) {
                System.err.printf("Name[%d]: %s ", j, names[j]);
            }

        } else {
            System.out.println("No arguments passed");
        }

        ArrayList<String> name_ls = new ArrayList<String>();
        String input = "";
        do {
            input = cons.readLine("Enter a name: ");
            if (!input.equals("quit")) {
                name_ls.add(input);
            }

        } while (!input.equals("quit"));

        for (String n: name_ls) {
            System.out.println(n);
        }

        ArrayList<String> words = new ArrayList<>();
        String keyboardInput = cons.readLine("Enter a sentence: ");
        Scanner sc = new Scanner(keyboardInput);

        while (sc.hasNext()) {
            words.add(sc.next());
        }

        sc.close();

        for (String w: words) {
            System.out.println(w);
        }


    }
}

// compile and run when in the VTTP5_SDF_DAY01 directory
// javac myapp/helloWorld.java
// java myapp.helloWorld

// to compile every java file in myapp/* into bin
// javac --source-path myapp -d bin myapp/*
// java -cp bin myapp.helloWorld

// to create a jar file, need to have class file first and change directory into the location you want the jar file to be in
// jar -c -v -f helloWorld.jar -e myapp.helloWorld .  (make sure there is a package myapp in the bin file)
// java -jar helloWorld.jar myapp.helloWorld


