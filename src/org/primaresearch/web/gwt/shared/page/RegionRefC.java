/*
 * Copyright 2015 PRImA Research Lab, University of Salford, United Kingdom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primaresearch.web.gwt.shared.page;

import java.io.Serializable;

/**
 * Reading order / layer region reference object. For use on client side ('C' for client)
 * 
 * @author Christian Clausner
 *
 */
public class RegionRefC implements Serializable, GroupMemberC {

	private static final long serialVersionUID = 1L;
	public String regionId = null;
	
	public RegionRefC() {
	}

	public RegionRefC(String regionId ) {
		this.regionId = regionId;
	}
}
