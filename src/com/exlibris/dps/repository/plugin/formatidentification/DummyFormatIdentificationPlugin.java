package com.exlibris.dps.repository.plugin.formatidentification;

import com.exlibris.core.sdk.consts.Enum.FormatIdentificationMethod;
import com.exlibris.dps.sdk.formatidentification.FormatIdentificationPlugin;
import com.exlibris.dps.sdk.formatidentification.FormatIdentificationResult;

public class DummyFormatIdentificationPlugin implements FormatIdentificationPlugin {

	private static String AGENT_NAME = "Dummy Format Identification Plugin ";
	private static String AGENT_VERSION = "1.0";
	private static String REGISTRY_NAME = "Dummy Registry Name";

	@Override
	public String getAgentName() {
		return AGENT_NAME;
	}

	@Override
	public String getAgentSignatureVersion() {
		return "Dummy Signature : " + AGENT_NAME + AGENT_VERSION;
	}

	@Override
	public String getAgentVersion() {
		return AGENT_VERSION;
	}

	@Override
	public String getFormatRegistryName() {
		return REGISTRY_NAME;
	}

	@Override
	public FormatIdentificationResult identifyFormat(String filePath) {
		//TODO Call out format identification tool here

		// Dummy implementation - Return multiple formats causing the Sip to fail and reach TA - Validation.
		DummyFormatIdentificationResult results = new DummyFormatIdentificationResult();
		results.setMethod(FormatIdentificationMethod.EXTENSION);
		results.addFormat("fmt/dummy");
		results.addFormat("fmt/example");
		return results;
	}

}
