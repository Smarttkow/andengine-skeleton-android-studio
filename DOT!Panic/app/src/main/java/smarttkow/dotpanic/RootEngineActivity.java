package smarttkow.dotpanic;

import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.SimpleBaseGameActivity;

/**
 * This is an extension of SimpleBaseGameActivity where developers can implement their functionality to set up the game.
 */
public class RootEngineActivity extends SimpleBaseGameActivity {
    @Override
    protected void onCreateResources(){
        //needs to be implemented
    }

    @Override
    protected Scene onCreateScene(){
        //needs to be implemented
        return null;
    }

    @Override
    public EngineOptions onCreateEngineOptions(){
        //needs to be implemented
        return null;
    }
}
