package var3d.net.demo;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSRange;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UITextField;
import org.robovm.apple.uikit.UITextFieldDidEndEditingReason;
import org.robovm.rt.bro.annotation.ByVal;

import var3d.net.center.ios.VIOSLauncher;

public class IOSLauncher extends VIOSLauncher {
    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        return new IOSApplication(new Game(this), config);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }

}