/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.List;

import observable.Observable;
import observable.Observer;

/**
 * @author ntp28459hteam
 *
 */
public class Clock implements Observable {

	private List<Observer> observers;
	private ClockState state;
	
	public Clock() {
		this.observers = new ArrayList<>();
		this.state = new ClockState();
	}
	
	public Clock(ClockState state) {
		this(); // important
		this.state = state;
	}
	
	public ClockState getState() {
		return state.getState();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver(Observer o) {
		for (Observer ob : observers) {
			ob.update(getState());
		}
	}

}
