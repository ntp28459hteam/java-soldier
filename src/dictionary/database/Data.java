/**
 * 
 */
package dictionary.database;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ntp28459hteam
 *
 */
public class Data {
    protected String name;
    protected String path; // path to file which stores
    protected boolean isModified = false;

    public void setModified(boolean isModified) {
        this.isModified = isModified;
    }

    public boolean isModified() {

        return isModified;
    }

    protected HashMap<String, String> data;
    protected ArrayList<String> keys;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public HashMap<String, String> getData() {
        return data;
    }

    public void setData(HashMap<String, String> data) {
        this.data = data;
    }

    public ArrayList<String> getKeys() {
        return keys;
    }

    public void setKeys(ArrayList<String> keys) {
        this.keys = keys;
    }
}
