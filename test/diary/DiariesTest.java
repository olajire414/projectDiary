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
    void testThatIHaveDiary_CanBeFoundByUserName(){
        Diary diary = new Diary("ola", "1111");
        diaries.add("ola", "1111");
        assertEquals("ola",diaries.findDiaryByUsername("ola").getUsername());
    }
    @Test
    void testThatIHaveDiary_PasswordAndUsernameCanBeDeleted(){
        Diary diary = new Diary("ola","1111");
        diaries.deleteDiary("ola","1111");
        assertEquals("null",diaries.findDiaryByUsername("ola").getUsername());
        assertEquals("null",diaries.findDiaryByPassword("ola").getPassword());




    }
}
