/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.referencedemodata;

import org.openmrs.annotation.OpenmrsProfile;
import org.openmrs.util.PrivilegeConstants;
import org.springframework.stereotype.Component;

@Component("referencedemodata.PrivilegeCompatibility")
@OpenmrsProfile(openmrsPlatformVersion = "2.*")
public class PrivilegeCompatibility2_0 implements PrivilegeCompatibility {

	@Override
	public String GET_PROVIDERS() {
		return PrivilegeConstants.GET_PROVIDERS;
	}

	@Override
	public String GET_PERSONS() {
		return PrivilegeConstants.GET_PERSONS;
	}
}