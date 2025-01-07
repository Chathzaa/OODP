package Adapter;

// Main.java (Client)
public class MainAd {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3"); // Output: Playing MP3 file: beyond the horizon.mp3
        audioPlayer.play("vlc", "far far away.vlc");       // Output: Playing VLC file: far far away.vlc
        audioPlayer.play("mp4", "mind me.mp4");           // Output: Playing MP4 file: mind me.mp4
        audioPlayer.play("avi", "movie.avi");             // Output: Invalid audio type: avi
    }
}

