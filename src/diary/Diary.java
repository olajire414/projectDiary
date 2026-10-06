package diary;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Diary {
    ArrayList<Entry> entries = new ArrayList<>();
    private String userName;
    private String password;
    boolean isLocked;


    public Diary(String username,String password){
        this.userName = username;
        this.password = password;
    }

    public void createEntry(String title,String body){
        if(!isLocked) {
            int id = entries.size() + 1;
            Entry entry = new Entry(id, title, body);
            entries.add(entry);

        }
    }

    public Entry findEntryById(int id) {
            for (Entry entry : entries) {
                if (entry.getId() == id) {
                    return entry;
                }
            }
        return null;
    }


    public void deleteEntry(int id){

        if(!isLocked) {
            Entry entry = findEntryById(id);
                if (entry != null) {
                    entries.remove(entry);
                }
        }
    }

    public boolean isLocked() {
      return  isLocked ;
    }

    public void lockDiary() {
        isLocked = true;
    }

    public void unLockDiary(String password) {
        if(this.password.equals(password)){
            isLocked = false;
        }

    }

    public void updateEntry(int id, String title,String body){
        if(!isLocked){
            Entry entry = findEntryById(id);
            if(entry != null){
                entry.setTitle(title);
                entry.setBody(body);
            }

        }


    }

}
