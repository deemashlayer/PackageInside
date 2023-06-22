package com.softwareag.is.scaffolding.test;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class api

{
	// ---( internal utility methods )---

	final static api _instance = new api();

	static api _newInstance() { return new api(); }

	static api _cast(Object o) { return (api)o; }

	// ---( server methods )---




	public static final void pairing (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(pairing)>> ---
		// @sigtype java 3.5
		System.out.println(pipeline);
		IDataCursor dataCursor = pipeline.getCursor();
		String pairingToken = "";
		
		if (dataCursor.first("pairingToken")) {
			pairingToken = (String) dataCursor.getValue();
		}
		
		pipeline.getCursor().insertAfter("result", "success");
		pipeline.getCursor().insertAfter("agentName", "AGENT_NAME");
		pipeline.getCursor().insertAfter("tenantId", "TENANT_ID");
		
		IData[] repositories = new IData[2];
		IData repo1 = IDataFactory.create();
		repo1.getCursor().insertAfter("name", "testRepo");
		repo1.getCursor().insertAfter("url", "https://github.com/testRepo");
		repo1.getCursor().insertAfter("user", "gituser");
		repo1.getCursor().insertAfter("password", "(AES)cafasdfpj123");
		
		IData repo2 = IDataFactory.create();
		repo2.getCursor().insertAfter("name", "repository");
		repo2.getCursor().insertAfter("url", "https://customer.github.com/repository");
		repo2.getCursor().insertAfter("user", "gitrepouser");
		repo2.getCursor().insertAfter("password", "(AES)mcsa123cas");
		
		repositories[0] = repo1;
		repositories[1] = repo2;
		
		pipeline.getCursor().insertAfter("repositories", repositories);
		pipeline.getCursor().insertAfter("manifestName", "AGENT_NAME-TENANT_ID-MANIFEST");
		
		if ("PAIRME".equals(pairingToken)) {
			pipeline.getCursor().insertAfter("agentManifest", 
					"name: a1manifest\n"
					+ "version: \"1.0.0\"\n"
					+ "model: agent-manifest\n"
					+ "tags: \n"
					+ "  - demo\n"
					+ "  - coucou\n"
					+ "repositories:\n"
					+ "  - name: \"Custom Packages\"\n"
					+ "    location: \"https://github.com/customerName/repo1\"\n"
					+ "  - name: \"Other resources\"\n"
					+ "    location: \"https://github.com/customerName/resourcesRepo\"\n"
					+ "packages:\n"
					+ "  - name: \"CommonUtils\"\n"
					+ "    repo: \"Custom Packages\"\n"
					+ "    version: \"1.0\"\n"
					+ "  - name: \"InvoiceProcessing\"\n"
					+ "    repo: \"Other Resources\"\n"
					+ "    version: \"2.1\"\n"
					+ "  - name: \"SupportPkg\"\n"
					+ "    repo: \"Custom Packages\"\n"
					+ "    version: \"1.0\"\n"
					+ "  - name: \"WmSAP\"\n"
					+ "    repo: \"Other Resources\"\n"
					+ "    version: \"10.7.5\"\n"
					+ "configurations:\n"
					+ "  - name: \"Name1\"\n"
					+ "    properties:\n"
					+ "      - name: user.Administrator.password\n"
					+ "        value: manage\n"
					+ "      - name: healthindicators.Cluster.enabled\n"
					+ "        value: \"false\"\n"
					+ "  - name: \"Name2\"\n"
					+ "    properties:\n"
					+ "      - name: user.Developer2.password\n"
					+ "        value: $env{val1}\n"
					+ "      - name: user.Developer3.password\n"
					+ "        value: $env{val2}\n"
					+ "libraries:\n"
					+ "  - repo: \"Custom Packages\"\n"
					+ "    source: \"/libraries/resources/mysql-connector-java-5.1.47.jar\"\n"
					+ "    target: \"/IntegrationServer/lib/jars\"\n");			
		} else if ("PAIRMENOW".equals(pairingToken)) {
			pipeline.getCursor().insertAfter("agentManifest", 
					"name: a1manifest\n"
					+ "version: \"1.0.0\"\n"
					+ "model: agent-manifest\n"
					+ "tags: \n"
					+ "  - demo\n"
					+ "  - coucou\n"
					+ "repositories:\n"
					+ "  - name: \"Custom Packages\"\n"
					+ "    location: \"https://github.com/customerName/repo1\"\n"
					+ "  - name: \"Other resources\"\n"
					+ "    location: \"https://github.com/customerName/resourcesRepo\"\n"
					+ "packages:\n"
					+ "  - name: \"CommonUtils\"\n"
					+ "    repo: \"Custom Packages\"\n"
					+ "    version: \"1.1\"\n"
					+ "  - name: \"InvoiceProcessing\"\n"
					+ "    repo: \"Other Resources\"\n"
					+ "    version: \"2.2\"\n"
					+ "  - name: \"SupportPkg\"\n"
					+ "    repo: \"Custom Packages\"\n"
					+ "    version: \"1.0\"\n"
					+ "  - name: \"WmSAP\"\n"
					+ "    repo: \"Other Resources\"\n"
					+ "    version: \"10.7.5\"\n"
					+ "configurations:\n"
					+ "  - name: \"Name1\"\n"
					+ "    properties:\n"
					+ "      - name: user.Administrator.password\n"
					+ "        value: manage2\n"
					+ "      - name: user.Administrator2.password\n"
					+ "        value: manage2\n"
					+ "  - name: \"Name2\"\n"
					+ "    properties:\n"
					+ "      - name: user.Developer2.password\n"
					+ "        value: $env{val1}\n"
					+ "      - name: user.Developer3.password\n"
					+ "        value: $env{val2}\n"
					+ "libraries:\n"
					+ "  - repo: \"Custom Packages\"\n"
					+ "    source: \"/libraries/resources/mysql-connector-java-5.1.48.jar\"\n"
					+ "    target: \"/IntegrationServer/lib/jars\"\n");	
		}
		
			
		// --- <<IS-END>> ---

                
	}
}

