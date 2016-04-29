import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;

public class LejosTesting {
	public static void main(String[] args) throws InterruptedException {
		   LCD.drawString("Waiting for input...", 1, 1);
		   Button.waitForAnyPress();
		   
		   while(!Button.ESCAPE.isDown()){
			   if(Button.LEFT.isDown()){
					Motor.A.setSpeed(500);
					Motor.A.rotateTo(-270);
					Thread.sleep(500);
					Motor.A.rotateTo(0);
			   }
			   if(Button.RIGHT.isDown()){
					for (int i = 0; i < 4; i++) {
						Motor.A.setSpeed(500);
						Motor.A.rotateTo(-270);
						Thread.sleep(500);
						Motor.A.rotateTo(0);
					}
			   }
		   }
	}
}
