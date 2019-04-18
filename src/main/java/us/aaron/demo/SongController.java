package us.aaron.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SongController {

    @RequestMapping("/songs")
    public List<Song> getAllSongs() {

        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Vermillion pt 1","Slipknot"));
        songs.add(new Song("Got your six","Five Finger Death Punch"));
        songs.add(new Song("Scars","I Prevail"));
        songs.add(new Song("Knockin On Heavens Door","Guns N' Roses"));
        songs.add(new Song("Don’t Stop Believin","Journey"));
        songs.add(new Song("Black Widow","In This Moment"));

        return songs;
    }
}
