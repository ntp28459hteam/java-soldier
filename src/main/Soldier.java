/**
 * 
 */
package main;

import observable.Observer;
import observable.State;

/**
 * @author ntp28459hteam
 *
 */
public class Soldier implements Observer {
	
	private State state = null;
	
	public Soldier() {
		this.state = new ClockState();
	}
	
	@Override
	public void update(State stateMsg) {
		this.state = stateMsg;
	}
	
	public String getMyWatch() {
		return this.state.toString();
	}

}
