package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiariesTest {
    Diaries diaries;

    @BeforeEach
    void startWith(){
        diaries = new Diaries();
    }
    @Test
    void testThatAddDiaryUserNameAndTitleToDiaries(){
        String username = "ola";
        String title = "example";
        diaries.add(username,title);
        assertEquals(1,diaries.getSize());
    }
    @Test
    void testThatFindDiaryByUserName(){
        Diary diary = new Diary("ola", "1111");
        diaries.add("ola", "1111");
        assertEquals("ola",diaries.findDiaryByUsername("ola").getUsername());


    }
}
