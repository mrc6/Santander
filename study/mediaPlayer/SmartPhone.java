public class SmartPhone implements MusicPlayer, VideoPlayer {
  
  @Override
  public void playMusic(){
    System.out.println("O SmartPhone está tocando a música.");
  }

  @Override
  public void pauseMusic(){
    System.out.println("O SmartPhone está pausando a música.");
  }

  @Override
  public void stopMusic(){
    System.out.println("O SmartPhone está parando a música.");
  }

  @Override
  public void playVideo(){
    System.out.println("O SmartPhone está tocando o vídeo.");
  }

  @Override
  public void pauseVideo(){
    System.out.println("O SmartPhone está pausando o vídeo.");
  }

  @Override
  public void stopVideo(){
    System.out.println("O SmartPhone está parando o vídeo.");
  }
}
