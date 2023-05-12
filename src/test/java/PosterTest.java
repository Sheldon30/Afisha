import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.Poster;

public class PosterTest {
    @Test
    public void shouldAdd() {

        Poster repo = new Poster();

        repo.addFilms("Film1");
        repo.addFilms("Film2");
        repo.addFilms("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast() {

        Poster repo = new Poster();

        repo.addFilms("Film1");
        repo.addFilms("Film2");
        repo.addFilms("Film3");

        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimit() {

        Poster repo = new Poster();

        repo.addFilms("Film1");
        repo.addFilms("Film2");
        repo.addFilms("Film3");
        repo.addFilms("Film4");
        repo.addFilms("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testMoreLimit() {

        Poster repo = new Poster();

        repo.addFilms("Film1");
        repo.addFilms("Film2");
        repo.addFilms("Film3");
        repo.addFilms("Film4");
        repo.addFilms("Film5");
        repo.addFilms("Film6");

        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testNotFilms() {

        Poster repo = new Poster();


        String[] expected = {};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
