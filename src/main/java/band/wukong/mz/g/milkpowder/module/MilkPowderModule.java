package band.wukong.mz.g.milkpowder.module;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

/**
 * description
 *
 * @author wukong(wukonggg@139.com)
 */
@At("/milkpowder")
public class MilkPowderModule {

    @At("/calc")
    @Ok("jsp:view.milkpowder.calc")
    public void calc() {
    }
}
