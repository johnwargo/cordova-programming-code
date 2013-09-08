var cordova = require('cordova');

var carrier = {
	getCarrierName : function(successCallback, errorCallback) {
		cordova.exec(successCallback, errorCallback, 'CarrierPlugin', 'getCarrierName', []);
	},

	getCountryCode : function(successCallback, errorCallback) {
		cordova.exec(successCallback, errorCallback, 'CarrierPlugin', 'getCountryCode', []);
	}
};

module.exports = carrier;
