package android;

import java.time.Duration;
import java.util.Collections;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.android.AndroidDriver;

public class MobileGestures {
    private final AndroidDriver driver;
    private final PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");

    public MobileGestures(AndroidDriver driver) {
        this.driver = driver;
    }

    // 1️ Tap Gesture
    public void tap(int x, int y) {
        Sequence tap = new Sequence(finger, 0);
        tap.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(tap));
    }

    // 2️ Long Press Gesture
    public void longPress(int x, int y, int holdTimeMs) {
        Sequence longPress = new Sequence(finger, 0);
        longPress.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), x, y));
        longPress.addAction(finger.createPointerDown(MouseButton.LEFT.asArg()));
        longPress.addAction(new Pause(finger, Duration.ofMillis(holdTimeMs))); // Hold for specified time
        longPress.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(longPress));
    }

    // 3️ Swipe Gesture (Start X, Y → End X, Y)
    public void swipe(int startX, int startY, int endX, int endY, int durationMs) {
        Sequence swipe = new Sequence(finger, 0);
        swipe.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(durationMs), Origin.viewport(), endX, endY));
        swipe.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipe));
    }

    // 4️ Scroll Gesture (Simulates swipe but longer)
    public void scroll(int startX, int startY, int endX, int endY) {
        swipe(startX, startY, endX, endY, 1000); // Scroll is a slow swipe
    }

    // 5 Drag & Drop (Move Element from X1, Y1 → X2, Y2)
    public void dragAndDrop(int startX, int startY, int endX, int endY) {
        Sequence dragDrop = new Sequence(finger, 0);
        dragDrop.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), startX, startY));
        dragDrop.addAction(finger.createPointerDown(MouseButton.LEFT.asArg()));
        dragDrop.addAction(finger.createPointerMove(Duration.ofMillis(1000), Origin.viewport(), endX, endY));
        dragDrop.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(dragDrop));
    }

    // 6️ Pinch Gesture (Zoom Out)
    public void pinch(int centerX, int centerY) {
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
        Sequence finger1Sequence = new Sequence(finger, 0);
        Sequence finger2Sequence = new Sequence(finger2, 0);

        // Move both fingers to the center
        finger1Sequence.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), centerX, centerY));
        finger2Sequence.addAction(finger2.createPointerMove(Duration.ZERO, Origin.viewport(), centerX, centerY));

        // Spread both fingers apart
        finger1Sequence.addAction(finger.createPointerMove(Duration.ofMillis(500), Origin.viewport(), centerX - 100, centerY - 100));
        finger2Sequence.addAction(finger2.createPointerMove(Duration.ofMillis(500), Origin.viewport(), centerX + 100, centerY + 100));

        // Lift fingers up
        finger1Sequence.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));
        finger2Sequence.addAction(finger2.createPointerUp(MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(finger1Sequence));
        driver.perform(Collections.singletonList(finger2Sequence));
    }

    // 7️⃣ Zoom Gesture (Zoom In)
    public void zoom(int centerX, int centerY) {
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
        Sequence finger1Sequence = new Sequence(finger, 0);
        Sequence finger2Sequence = new Sequence(finger2, 0);

        // Move both fingers apart
        finger1Sequence.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), centerX - 100, centerY - 100));
        finger2Sequence.addAction(finger2.createPointerMove(Duration.ZERO, Origin.viewport(), centerX + 100, centerY + 100));

        // Bring fingers to center
        finger1Sequence.addAction(finger.createPointerMove(Duration.ofMillis(500), Origin.viewport(), centerX, centerY));
        finger2Sequence.addAction(finger2.createPointerMove(Duration.ofMillis(500), Origin.viewport(), centerX, centerY));

        // Lift fingers up
        finger1Sequence.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));
        finger2Sequence.addAction(finger2.createPointerUp(MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(finger1Sequence));
        driver.perform(Collections.singletonList(finger2Sequence));
    }
}
