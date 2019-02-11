package pl.wiacekp.patterns.adapter.player;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String type, String fileName) {
        //inbuilt support to play mp3 music files
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, fileName);
        }

        else{
            System.out.println("Invalid media. " + type + " format not supported");
        }
    }
}
