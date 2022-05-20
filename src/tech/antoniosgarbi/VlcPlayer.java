package tech.antoniosgarbi;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Tocando o arquivo vlc. Nome: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }

}