/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package energister.systemd.daemon.sample;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test void appHasAGreeting() {
        GracefulShutdownService classUnderTest = new GracefulShutdownService();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
