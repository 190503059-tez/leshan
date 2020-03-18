/*******************************************************************************
 * Copyright (c) 2015 Sierra Wireless and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 * 
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package org.eclipse.leshan.client.resource;

import java.util.Collection;

import org.eclipse.leshan.core.model.ObjectModel;

public interface LwM2mInstanceEnablerFactory {

    /**
     * Create a new instance enabler.
     * 
     * @param model of this instance (CAN NOT be null).
     * @param id of this instance or NULL if the id MUST be generated by the factory.
     * @param alreadyUsedIdentifier a collection of id already in used. The new instance MUST NOT use an id contained in
     *        this collection. It CAN be NULL if id is NOT NULL.
     * 
     * @return the new instance enabler
     */
    LwM2mInstanceEnabler create(ObjectModel model, Integer id, Collection<Integer> alreadyUsedIdentifier);
}
