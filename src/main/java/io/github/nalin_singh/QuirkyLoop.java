package io.github.nalin_singh;

import java.util.Random;

public class QuirkyLoop {
    public static void runQuirkyLoop() {
        Random rand = new Random();
        int count = 0;
        while (true) {
            count++;
            System.out.println("You've been looped " + count + " times!");
            if (rand.nextInt(20) == 0) {
                System.out.println("Just kidding, I'll stop now!");
                break;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException err) {
                System.out.println("Oops! The loop was interrupted. Exiting early...");
                err.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        runQuirkyLoop();
    }
}
