public class Main{

  public static void runVideo(VideoPlayer videoPlayer){
      videoPlayer.playVideo();
  }
  
  public static void runMusic(MusicPlayer musicPlayer){
      musicPlayer.playMusic();
  }
  
  public static void main(String[] args){
    SmartPhone smartPhone = new SmartPhone();
    
    runVideo(smartPhone);
    runMusic(smartPhone);

  }
}
