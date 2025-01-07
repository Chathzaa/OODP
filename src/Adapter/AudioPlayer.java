package Adapter;

// AudioPlayer.java (Client)
public class AudioPlayer implements MediaPlayer {
    private MediaPlayer mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Play supported formats directly
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        }
        // Use adapter to play VLC or MP4
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = getAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid audio type: " + audioType);
        }
    }

    private MediaPlayer getAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            return new VLCAdapter(new VLCPlayer());
        } else if (audioType.equalsIgnoreCase("mp4")) {
            return new MP4Adapter(new MP4Player());
        }
        return null;
    }
}

