#import <Cordova/CDVPlugin.h>

@interface CarrierPlugin : CDVPlugin {

}

- (void)getCarrierName:(CDVInvokedUrlCommand*)command;
- (void)getCountryCode:(CDVInvokedUrlCommand*)command;

@end


