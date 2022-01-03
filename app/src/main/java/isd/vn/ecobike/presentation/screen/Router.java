package isd.vn.ecobike.presentation.screen;

import android.content.Context;

import isd.vn.ecobike.presentation.screen.barcode.BarcodeActivity;

public class Router {
    public static void startScreen(Context context, String key, Object wrapper) {
        switch (key) {
            case ScreenName.BARCODE_SCREEN:
                BarcodeActivity.startActivity(context);
                break;
            case "payment":
                break;
            default:
                break;
        }
    }
    public interface ScreenName{
        String BARCODE_SCREEN = "barcode";
    }
}

