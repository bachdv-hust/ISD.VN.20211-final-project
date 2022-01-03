package isd.vn.ecobike.presentation.screen;

import android.content.Context;

import isd.vn.ecobike.presentation.screen.barcode.BarcodeActivity;
import isd.vn.ecobike.presentation.screen.bike.BikeInfoActivity;
import isd.vn.ecobike.presentation.screen.station.StationActivity;

public class Router {
    public static void startScreen(Context context, String key, Object wrapper) {
        switch (key) {
            case ScreenName.BARCODE_SCREEN:
                BarcodeActivity.startActivity(context);
                break;
            case ScreenName.BIKE_INFO_SCREEN:
                BikeInfoActivity.startActivity(context);
                break;
            case ScreenName.STATION_INFO_SCREEN:
                StationActivity.startActivity(context);
                break;
            default:
                break;
        }
    }
    public interface ScreenName{
        String BARCODE_SCREEN = "barcode";
        String BIKE_INFO_SCREEN = "bike_info";
        String STATION_INFO_SCREEN = "station_info";
    }
}

