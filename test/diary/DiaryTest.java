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
        String title = "semicolon journey";
        String body = "i learnt design thinking";
        diary.createEntry(title, body);
        assertEquals(title, diary.findTitle(title).getTitle());
        assertEquals(body, diary.findBody(body).getBody());
    }
    @Test
    void testThatDiaryisLocked(){
        assertTrue(diary.isLocked());

        }






    }






}
