/**
 * This class is responsible for keeping the states of the Clock
 */
package main;

import observable.State;

/**
 * @author ntp28459hteam
 *
 */
public class ClockState implements State {
	private int year;
	private int month;
	private int day;
	
	private int hour;
	private int min;
	private int sec;
	
	public ClockState() {
		
	}
	
	public ClockState(int sec, int min, int hour, 
			int day, int month, int year) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public ClockState(ClockState state) {
		this(state.sec, state.min, state.hour, 
				state.day, state.month, state.year);
	}
	
	public String toString() {
		return Integer.toString(hour) + "-" +
				Integer.toString(min) + "-" +
				Integer.toString(sec) + "--" +
				Integer.toString(day) + "/" +
				Integer.toString(month) + "/" + 
				Integer.toString(year);
	}
	
	public ClockState getState() {
		return new ClockState(this);
	}
}
