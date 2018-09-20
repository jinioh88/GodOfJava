package e.thread.practice;

import java.util.Date;

public class TimeerThread extends Thread {
    public void run() {
        printCurrentTime();
    }

    public void printCurrentTime() {
        int count = 0;
        while(count<10) {
            count++;
            try {
                sleep(1000);
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime)+" "+currentTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
