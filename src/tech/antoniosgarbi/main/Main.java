package tech.antoniosgarbi.main;

import tech.antoniosgarbi.AudioPlayer;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "ceu azul.mp3");
        audioPlayer.play("mp4", "lugar ao sol.mp4");
        audioPlayer.play("vlc", "zoio de lula.vlc");
        audioPlayer.play("avi", "dias de luta, dias de gloria.avi");
    }

}