package isd.vn.ecobike;

import android.app.Application;

import isd.vn.ecobike.common.utils.AppUtils;

public class EcoBikeApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppUtils.init(this);
    }
}
