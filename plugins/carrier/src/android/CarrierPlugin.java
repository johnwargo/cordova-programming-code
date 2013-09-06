package com.cordovaprogramming.carrier;

//Cordova imports
//import org.apache.cordova.Config;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
//import org.apache.cordova.api.PluginResult;
import org.apache.cordova.CordovaWebView;

//Android imports
import android.content.Context;
import android.telephony.TelephonyManager;
//JSON Imports
import org.json.JSONArray;
import org.json.JSONException;

public class CarrierPlugin extends CordovaPlugin {

	// define some constants for the suported actions
	public static final String ACTION_GET_CARRIER_NAME = "getCarrierName";
	public static final String ACTION_GET_COUNTRY_CODE = "getCountryCode";

	public TelephonyManager tm;

	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		// the plugin doesn't have direct access to the application context,
		// so you have to get it first
		Context context = this.cordova.getActivity().getApplicationContext();
		// Next we initialize the tm object
		tm = (TelephonyManager) context
				.getSystemService(Context.TELEPHONY_SERVICE);
	}

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		try {
			// First check on the getCarrierName
			if (ACTION_GET_CARRIER_NAME.equals(action)) {
				// callbackContext.success(tm.getSimOperatorName());
				callbackContext.success("getCarrierName Result");
				return true;
			} else {
				// Next see if its a getCountryCode action
				if (ACTION_GET_COUNTRY_CODE.equals(action)) {
					// callbackContext.success(tm.getSimCountryIso());
					callbackContext.success("getCountryCode Result");
					return true;
				}
			}
			// We don't have a match, so it must be an invalid action
			callbackContext.error("Invalid Action");
			return false;
		} catch (Exception e) {
			// If we get here, then something horrible has happened
			System.err.println("Exception: " + e.getMessage());
			callbackContext.error(e.getMessage());
			return false;
		}
	}
}