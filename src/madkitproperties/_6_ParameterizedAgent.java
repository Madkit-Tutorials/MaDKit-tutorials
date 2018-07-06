package madkitproperties;

import madkit.kernel.Agent;

/**
 * This class only purpose is to exemplify the use of a XML property file with MaDKit.
 */

public class _6_ParameterizedAgent extends Agent{

	private String message;
	
	@Override
	protected void live() {
		pause(2500);
		getLogger().talk("\n\t" + message + "t\n");
		pause(5000);
	}
}
