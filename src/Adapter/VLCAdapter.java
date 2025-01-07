package Adapter;

// VLCAdapter.java (Adapter for VLCPlayer)
public class VLCAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer;

    public VLCAdapter(VLCPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVLC(fileName);  // Delegate to VLCPlayer
        }
    }
}

