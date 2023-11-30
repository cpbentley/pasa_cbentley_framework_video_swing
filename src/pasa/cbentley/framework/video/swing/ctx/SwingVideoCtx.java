package pasa.cbentley.framework.video.swing.ctx;

import pasa.cbentley.core.src4.ctx.ACtx;
import pasa.cbentley.framework.core.swing.ctx.CoreFrameworkSwingCtx;

public class SwingVideoCtx extends ACtx {

   protected final CoreFrameworkSwingCtx cfc;

   public SwingVideoCtx(CoreFrameworkSwingCtx cfc) {
      super(cfc.getUCtx());
      this.cfc = cfc;
   }
   
   public CoreFrameworkSwingCtx getCoreSwingCtx() {
      return cfc;
   }
   public int getCtxID() {
      return 405;
   }

}
