package pasa.cbentley.framework.video.swing.engine;

import pasa.cbentley.byteobjects.src4.core.ByteObject;
import pasa.cbentley.framework.core.ui.swing.ctx.CoreUiSwingCtx;
import pasa.cbentley.framework.core.ui.swing.engine.CanvasHostSwingAbstract;
import pasa.cbentley.framework.coredraw.src4.interfaces.IGraphics;
import pasa.cbentley.framework.video.swing.ctx.SwingVideoCtx;

public class CanvasVLC extends CanvasHostSwingAbstract {

   protected final SwingVideoCtx svc;

   public CanvasVLC(SwingVideoCtx svc, ByteObject tech) {
      super(svc.getCoreSwingCtx().getCoreUiSwingCtx(), tech);
      this.svc = svc;
   }

   public void flushGraphics() {
      // TODO Auto-generated method stub

   }

   public void setStartPosition() {
   }

   public IGraphics getGraphics() {
      // TODO Auto-generated method stub
      return null;
   }

   public int getICHeight() {
      // TODO Auto-generated method stub
      return 0;
   }

   public int getICWidth() {
      // TODO Auto-generated method stub
      return 0;
   }

   public int getICX() {
      // TODO Auto-generated method stub
      return 0;
   }

   public int getICY() {
      // TODO Auto-generated method stub
      return 0;
   }

   public ByteObject getSettings() {
      // TODO Auto-generated method stub
      return null;
   }

   public void icRepaint(int x, int y, int w, int h) {
      // TODO Auto-generated method stub

   }

   public void icSetSize(int w, int h) {
      // TODO Auto-generated method stub

   }

   public void icSetXY(int x, int y) {
      // TODO Auto-generated method stub

   }

   public boolean setCanvasFeature(int feature, Object mode) {
      // TODO Auto-generated method stub
      return false;
   }

   public void setIcon(String string) {
      // TODO Auto-generated method stub

   }

   public void setTitle(String string) {
      // TODO Auto-generated method stub

   }


}
