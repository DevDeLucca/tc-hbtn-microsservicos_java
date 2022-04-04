import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping("/welcome")
    public String mensagemBoasVindas() {
        String msg = "Bem vindo";
        return msg;
    }

    @GetMapping(path = "/allSongs")
    public List<Song> getAllSongs() {
        List<Song> songs = songRepository.getAllSongs();
        return songs;
    }

    @GetMapping(path = "/findSong/{id}")
    public Song findSongById(@PathVariable Integer id) {
        Song song = songRepository.getSongById(id);
        return song;
    }

    @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
    public Song addSong(@RequestBody Song song) {
        return songRepository.addSong(song);
    }

    @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
    public Song updadeSong(@RequestBody Song song) {
        return songRepository.updateSong(song);
    }

    @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
    public void deleteSongById(@RequestBody Song song) {
        songRepository.removeSong(song);
    }
}
