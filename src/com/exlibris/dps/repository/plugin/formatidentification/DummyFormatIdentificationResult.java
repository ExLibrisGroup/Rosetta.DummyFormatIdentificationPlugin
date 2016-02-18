package com.exlibris.dps.repository.plugin.formatidentification;

import java.util.ArrayList;
import java.util.List;

import com.exlibris.core.sdk.consts.Enum.FormatIdentificationMethod;
import com.exlibris.dps.sdk.formatidentification.FormatIdentificationResult;

public class DummyFormatIdentificationResult implements FormatIdentificationResult {

	private List<String> formats;
	private FormatIdentificationMethod method;

	@Override
	public List<String> getFormats() {
		return formats;
	}

	@Override
	public FormatIdentificationMethod getIdentificationMethod() {
		return method;
	}

	public void setFormat(List<String> formats) {
		this.formats = formats;
	}

	public void setMethod(FormatIdentificationMethod method) {
		this.method = method;
	}

	public void addFormat(String format) {
		if(formats == null){
			formats = new ArrayList<String>();
		}
		formats.add(format);
	}

}
