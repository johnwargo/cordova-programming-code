#import <Cordova/CDVPlugin.h>

@interface CarrierPlugin : CDVPlugin {

}

- (void)getCarrier:(CDVInvokedUrlCommand*)command;
- (void)getCountryCode:(CDVInvokedUrlCommand*)command;

@end


