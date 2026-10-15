package diary;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Diary {
    private List<Entry> entries = new ArrayList<>();
    private String username;
    private String password;
    private boolean isLocked;
    private int size;
    private String title;

    public String getUsername() {
        return username;
    }

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void createEntry(String title, String body) {
        Entry entry = new Entry();
        entry.setId(size++);
        if (!isLocked) {
            entry = new Entry();
            entry.setTitle(title);
            entry.setBody(body);
            entries.add(entry);
        }
    }

    public int getSize() {
        if (entries == null) {
            return 0;
        }
        return size;
    }

    public void lockDiary() {
        isLocked = true;

    }

    public boolean islocked() {
        return isLocked;
    }

    public void add(Entry entry) {
        entry.setId(size++);
        entries.add(entry);


    }

    public void deleteEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                entry.setId(0);
            }
        }
        size--;
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public Entry findEntryByTitle(String title) {
        for (Entry entry : entries) {
            if (entry.getTitle().equals(title)) {
                return entry;
            }
        }
        return null;
    }

    public Entry findEntryByBody(String body) {
        for (Entry entry : entries) {
            if (entry.getTitle().equals(body)) {
                return entry;
            }
        }
        return null;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPassword(String password) {
        this.password = password;

    }
    public String getPassword() {
        return password;

    }
}



