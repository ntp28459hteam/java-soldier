/**
 * 
 */
package dictionary.database;

/**
 * @author ntp28459hteam
 *
 */
public interface DataLoader {
	public Data loadData();	
	
    public abstract void readData();
    public abstract void update(); // update data on disk
    public abstract void addWord(String word,String definition);
    public abstract void modifyWord(String word, String newWord, String newDefinition);
    public abstract void removeWord(String word);
    public abstract void removeAll();
}
