package utils;

import com.fizzed.ninja.rocker.DefaultNinjaRocker;
import com.fizzed.ninja.rocker.NinjaRockerTemplate;
import com.fizzed.rocker.RockerModel;
import com.fizzed.rocker.RockerTemplate;
import com.fizzed.rocker.RockerUtils;


abstract public class NinjaStarterRockerTemplate extends NinjaRockerTemplate {
    public NinjaStarterRocker A;

    public NinjaStarterRockerTemplate(RockerModel model) {
        super(model);
    }

    /**
     * Apply NinjaRocker to template immediately before rendering. Best place
     * to setup your own application-specific properties or methods that rely
     * on Ninja context, router, messages, etc.
     * @param N The ninja rocker instance
     */
    @Override
    public void __apply(DefaultNinjaRocker N) {
        super.__apply(N);
        this.A = new NinjaStarterRocker(N);
    }

    /**
     * Associate this template with another template during the rendering
     * process.  This occurs when Template A calls or includes Template B.
     * Usually, you simply want to copy over the variables you created in
     * the __apply method.
     * @param template The template to associate us with
     */
    @Override
    protected void __associate(RockerTemplate template) {
        super.__associate(template);
        NinjaStarterRockerTemplate applicationTemplate
            = RockerUtils.requireTemplateClass(template, NinjaStarterRockerTemplate.class);
        this.A = applicationTemplate.A;
    }

}
