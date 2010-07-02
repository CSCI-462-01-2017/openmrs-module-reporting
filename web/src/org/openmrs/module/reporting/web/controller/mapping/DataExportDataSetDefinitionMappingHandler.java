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
package org.openmrs.module.reporting.web.controller.mapping;

import org.openmrs.annotation.Handler;
import org.openmrs.module.reporting.dataset.definition.DataExportDataSetDefinition;
import org.openmrs.module.reporting.evaluation.Definition;

/**
 * Handler that determines what pages are redirected for creating and editing DataSetDefinitions
 */
@Handler(supports=DataExportDataSetDefinition.class, order=50)
public class DataExportDataSetDefinitionMappingHandler extends DefinitionMappingHandler {
	
	/**
	 * @see DefinitionMappingHandler#getCreateUrl(Class)
	 */
	public String getCreateUrl(Class<? extends Definition> type) {
		return "/admin/reports/dataExport.form";
	}

	/**
	 * @see DefinitionMappingHandler#getEditUrl(Definition)
	 */
	@Override
	public String getEditUrl(Definition definition) {
		return getCreateUrl(definition.getClass()) + "?dataExportId=" + definition.getId();
	}

	/**
	 * @see DefinitionMappingHandler#getViewUrl(Definition)
	 */
	@Override
	public String getViewUrl(Definition definition) {
		// TODO Auto-generated method stub
		return super.getViewUrl(definition);
	}
}