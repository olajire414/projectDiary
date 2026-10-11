package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Entry entry = new Entry(1,"topic","yes sir");
    Diary diary;
    @BeforeEach
    void startWith(){
         diary = new Diary("olajire", "12345");
    }
    @Test
    void testThatEntryCanBeCreatedInDiary() {

        String body = "i learnt design thinking";
        String title = "learning journing";
        diary.createEntry(title, body);
        assertEquals(id, diary.findEntryById(id).getId());
    }
    @Test
    void testThatDiaryCanBeUnlocked(){
        diary.lockDiary();
        diary.unLockDiary("12345");
        assertFalse(diary.isLocked());



        }















    }







