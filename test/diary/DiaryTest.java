package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    Diary diary;
    //Entry entry;
    @BeforeEach
    void startWith(){
         diary = new Diary();
    }


    @Test
    void testThatNumberOfEntryIsZero() {
        assertEquals(0,diary.getSize());

    }
   @Test
   void testThatEntryCanBeCreated(){
        String title = "the tall tree";
        String body = "worship the tree";
       diary.createEntry(title,body);
       assertEquals(1,diary.getSize());
        }

    @Test
    void testThatDiaryIsLocked(){
        diary.lockDiary();
        assertTrue(diary.islocked());
    }

    @Test
    void testThatEntryCanBeDeleted(){
        Entry entry = new Entry();
        entry.setId(1);
        diary.add(entry);
        assertEquals(1,diary.getSize());
        diary.deleteEntryById(1);
        assertEquals(0,diary.getSize());
    }
    @Test
    void testThatEntryCanBeFoundById(){
        Entry entry = new Entry();
        diary.add(entry);
        assertEquals(1,diary.getSize());
        entry.setId(1);
        assertEquals(1,diary.findEntryById(1).getId());
    }

   @Test
   void testThatEntryCanBeUpdated() {
       Entry entry = new Entry();
       diary.add(entry);
       entry.setId(1);
       entry.setId(2);
       assertEquals(2, diary.findEntryById(2).getId());
       entry.setTitle("human");
       entry.setTitle("hmmm");
       assertEquals("hmmm", diary.findEntryByTitle("hmmm").getTitle());
       entry.setBody("human");
       entry.setBody("hmmm");
       assertEquals("hmmm", diary.findEntryByBody("hmmm").getBody());

   }
    }


























