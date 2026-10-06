package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    void startWith(){
         diary = new Diary("olajire", "12345");
    }
    @Test
    void testThatEntryCanBeCreatedInDiary() {
        int id = 1;
        String body = "i learnt design thinking";
        String title = "learning journing";
        diary.createEntry(title, body);
        assertEquals(id, diary.findEntryById(id).getId());
    }
    @Test
    void testThatDiaryisLocked(){
        assertTrue(diary.isLocked());

        }






    }







