/**
 * 
 */
package observable;

/**
 * @author ntp28459hteam
 *
 */
public interface Observable {	
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObserver(Observer o);
}
