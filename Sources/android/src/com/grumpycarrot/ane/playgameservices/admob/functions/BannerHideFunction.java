package com.grumpycarrot.ane.playgameservices.admob.functions;

import com.grumpycarrot.ane.playgameservices.Extension;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class BannerHideFunction implements FREFunction {


	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		
		Extension.context.banner.hide();
		return null;

	}
}