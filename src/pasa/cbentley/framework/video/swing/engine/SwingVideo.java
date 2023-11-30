package pasa.cbentley.framework.video.swing.engine;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import pasa.cbentley.framework.coreui.swing.engine.RealCanvasAWTCanvas;
import pasa.cbentley.framework.video.swing.ctx.SwingVideoCtx;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.medialist.MediaList;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.list.MediaListPlayer;
import uk.co.caprica.vlcj.player.list.MediaListPlayerMode;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

/**
 * Implements the Bentley interface for video playback
 * @author Charles Bentley
 *
 */
public class SwingVideo {

   private RealCanvasAWTCanvas       c;

   private MediaListPlayer       listPlayer;

   private MediaList             mediaList;

   private MediaPlayerFactory    mpf;

   protected final SwingVideoCtx svc;

   private CanvasVLC             vlcCanvas;

   /**
    * What kind of Wrapper?
    * @param dd
    */
   public SwingVideo(SwingVideoCtx svc) {
      this.svc = svc;
      vlcCanvas = new CanvasVLC(svc, null);

      NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC");
      Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
      //initialize media player
      mpf = new MediaPlayerFactory();
   }

   public void append(String file) {
      mediaList.addMedia(file);
   }

   private void createPlayer() {

      EmbeddedMediaPlayer emp = mpf.newEmbeddedMediaPlayer();
      emp.setVideoSurface(mpf.newVideoSurface(c));

      MediaListPlayer listPlayer = mpf.newMediaListPlayer();

      listPlayer.setMediaPlayer(emp);
   }

   /**
    * Called when the Application is shutdown or when Canvas hosting the video is closed by the user.
    * <br>
    */
   public void exitHook() {

   }

   public void pause() {
      listPlayer.pause();
   }

   public void play() {
      listPlayer.play();
   }

   public void play(String file) {
      mediaList = mpf.newMediaList();
      mediaList.addMedia(file);
      listPlayer.setMediaList(mediaList);
      listPlayer.setMode(MediaListPlayerMode.LOOP);
   }

   public void stop() {
      listPlayer.stop();
   }
}
