package com.grumpycarrot.ane.playgameservices.admob.functions;


import com.grumpycarrot.ane.playgameservices.Extension;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;


public class InterstitialIsLoadedFunction implements FREFunction {


	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		
		Boolean result = Extension.context.interstitial.isInterstialLoaded();

		try { return FREObject.newObject(result); }
		catch (Exception e1) { return null;}
		
	}
}