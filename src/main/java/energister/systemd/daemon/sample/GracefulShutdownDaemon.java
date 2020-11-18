package energister.systemd.daemon.sample;

import java.io.IOException;
import java.util.concurrent.Semaphore;

public class GracefulShutdownDaemon {
    public static void main(String[] args) throws InterruptedException {

        Runtime.getRuntime().addShutdownHook(
                /**
                 * Shutdown hooks are executed:
                 *     When last app's non-daemon thread terminates
                 *     When System.exit() has been called from Java code
                 *     Because user hit CTRL-C
                 *     System level shutdown or User Log-Off
                 */
                new Thread(() -> {
                    System.out.println("Shutdown Hook has been executed");

                    // put shutdown code here

                    purgeInputBuffer();
                })
        );

        System.out.println("Service started");
        System.out.println("Press Ctrl-C to exit");
        new Semaphore(0).acquire();
        // don't put anything here: only shutdown hooks will execute until the end
    }

    private static void purgeInputBuffer() {
        try {
            int length = System.in.available();
            for (int i = 0; i < length; i++) {
                System.in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
