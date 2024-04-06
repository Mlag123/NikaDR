package Base;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

public class SoundEngine {
    public static final String sound_path = "./Resources/sound/";
    private AudioInputStream sound;

    private Clip clip;

    public void setFile(String path_to_sound) {
        try {
            File file = new File(sound_path + path_to_sound);
            sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    public void play() {
        clip.start();
        //   System.out.println(clip.getMicrosecondLength()/1000000);
    }


    public void stop() throws IOException {
        sound.close();
        clip.close();
        clip.stop();
    }
}
