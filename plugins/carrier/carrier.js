var cordova = require('cordova');

var carrier = {
	getCarrier : function(successCallback, errorCallback) {
		cordova.exec(successCallback, errorCallback, 'CarrierPlugin', 'getCarrierName', []);
	},

	getCountryCode : function(successCallback, errorCallback) {
		cordova.exec(successCallback, errorCallback, 'CarrierPlugin', 'getCountryCode', []);
	}
};

module.exports = carrier;
