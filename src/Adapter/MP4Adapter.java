package Adapter;

// MP4Adapter.java (Adapter for MP4Player)
public class MP4Adapter implements MediaPlayer {
    private MP4Player mp4Player;

    public MP4Adapter(MP4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMP4(fileName);  // Delegate to MP4Player
        }
    }
}

