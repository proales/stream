import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import com.hamoid.*; 
import ddf.minim.*; 
import ddf.minim.analysis.*; 
import ddf.minim.spi.*; 
import java.util.Base64; 
import java.io.*; 
import java.nio.file.Files; 
import java.nio.file.Paths; 
import java.nio.file.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class clock extends PApplet {











VideoExport videoExport;

public void setup() {
  
  frameRate(10);
}
public void draw() {
  videoExport = new VideoExport(this, "clock.mp4");
  videoExport.setFrameRate(60);
  videoExport.setAudioFileName("jingle.mp3");
  videoExport.startMovie();
  
  for (int i = 0; i < 6; i++) {
    background(0);
    noStroke();
    textSize(64);
    fill(255, 0, 0);  
    String[] sa1 = {str(hour()), nf(minute(), 2), nf(second(),2)};
    text(join(sa1, ":"), 500, 350);
    videoExport.saveFrame();
  }
  videoExport.endMovie();
  String source = sketchPath("clock.mp4");
  String newdir = sketchPath("stream.mp4");
  try {
    Files.move(Paths.get(source), Paths.get(newdir), StandardCopyOption.ATOMIC_MOVE);
  } catch (IOException e) {
    print(e);
  }
}
  public void settings() {  size(1280, 720); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "clock" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
