
package models;

import java.io.*;

/**
 *
 * @author 786097
 */
public class Note implements Serializable {
    
    private String title;
    private String contents;
    
    public Note(){
      
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    
}