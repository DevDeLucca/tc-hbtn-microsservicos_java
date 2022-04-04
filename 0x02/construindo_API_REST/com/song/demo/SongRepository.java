import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {

    private List<Song> list = new ArrayList<Song>();

    private static Integer id = 0;

    public List<Song> getAllSongs() {
            return list;
    }

    public Song getSongById(Integer id) {
            return list.stream().filter(song -> song.getId().equals(id)).findFirst().orElse(null);
    }

    public Song addSong(Song s) {
       if (s.getId() == null) {
           id ++;
           s.setId(id);
           list.add(s);
           return s;
       }
        return null;
    }

    public Song updateSong(Song s) {
        if (s.getId() != null){
            Song song = getSongById(s.getId());
            if (song != null){
                list.remove(song);
                list.add(s);
                return s;
            }
        }
        return null;

    }

    public void removeSong(Song s) {
        Song song = getSongById(s.getId());
        list.remove(song);
    }
}
