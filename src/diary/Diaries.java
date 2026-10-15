package diary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();
    private String username;
    private String title;
    private int size;


    public void add(String username, String password) {
        Diary diary = new Diary(username, password);
        diary.setUsername(username);
        diary.setTitle(title);
        diaries.add(diary);
        size++;
   }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSize() {
    return size;
    }

    public Diary findDiaryByUsername(String username) {
    for(Diary diary : diaries){
        if(diary.getUsername().equals(username)){
            return diary;
        }
    }
    return null;
    }
}
