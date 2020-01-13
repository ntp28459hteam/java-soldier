/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.List;

import observable.Observer;

/**
 * @author ntp28459hteam
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Clock clock = new Clock(new ClockState(
				0, 48, 20, 8, 01, 2020));
		List<Observer> soldiers = new ArrayList<>();
		
		Observer soldier1 = new Soldier();
		Observer soldier2 = new Soldier();
		
		System.out.println(((Soldier) soldier1).getMyWatch());
		
		soldiers.add(soldier1);
		soldiers.add(soldier2);
		
		for (Observer o : soldiers) {
			clock.registerObserver(o);
		}
		
		for (Observer o : soldiers) {
			clock.notifyObserver(o);
		}
		
		System.out.println(((Soldier) soldier1).getMyWatch());
		
		
	}

}
