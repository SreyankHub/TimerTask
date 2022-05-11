//imports
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        //Timer
        Timer timer = new Timer();

        //TimerTask
        TimerTask timerTask = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {

                //If Statement
                if(counter>0) {

                    System.out.println(counter);
                    counter--;
                }

                else {
                    System.out.println("Done!!");
                    timer.cancel();
                }


            }
        };

        //For 1 delaying add
        timer.scheduleAtFixedRate(timerTask,0,1000);

    }
}
