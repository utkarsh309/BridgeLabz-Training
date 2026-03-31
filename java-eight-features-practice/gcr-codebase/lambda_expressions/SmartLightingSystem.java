package lambda_expressions;

//functional interface
@FunctionalInterface
interface LightAction{
	void activate();
}

public class SmartLightingSystem {

	public static void main(String[] args) {
		
		LightAction motionTrigger=() -> 
				System.out.println("Lights turned ON at full brightness due to motion");
				
		LightAction nightTrigger=() ->
				System.out.println("Lights turned ON in dim mode for night");
				
		LightAction voiceTrigger=() ->
				System.out.println("Lights turned ON using voice command");
				
		// Execute actions
		motionTrigger.activate();
		nightTrigger.activate();
		voiceTrigger.activate();
	}
}
