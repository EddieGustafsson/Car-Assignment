package com.company;

import java.util.Scanner;

import com.company.Car.CarType;

public class Main {

    public static void main(String[] args){
        Car car = new Car(CarType.SEDAN);
        String input = "none";
		Scanner scanner = new Scanner(System.in);

        help();

        while (!input.equals("/quit")) {
            input = scanner.nextLine();

            switch (input) {
                case "/start":
                    car.start();
                    break;
                case "/go":
                    car.go();
                    break;
                case "/stop":
                    car.stop();
                    break;
                case "/kill":
                    car.kill();
                    break;
                case "/info":
                    car.info();
                    break;
                case "/quit":
                    break;
                case "/help":
                    help();
                    break;
                default:
                    System.out.println("Unrecognized command..");
            }
        }
    }
    
    static void help() {
        System.out.println("Available commands:");
        System.out.println("/start - start engine");
        System.out.println("/go - apply throttle");
        System.out.println("/stop - apply brakes");
        System.out.println("/kill - turn off engine");
        System.out.println("/info - print car info");
        System.out.println("/quit - exit program");
        System.out.println("/help - list commands");
    }
    
}
