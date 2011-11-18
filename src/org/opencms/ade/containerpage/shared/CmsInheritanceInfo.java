/*
 * File   : $Source$
 * Date   : $Date$
 * Version: $Revision$
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2011 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.ade.containerpage.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * A class whose instances are added to container element beans to provide information about container inheritance.<p>
 * 
 */
public class CmsInheritanceInfo implements IsSerializable {

    /** True if this is a new element. */
    private boolean m_isNew;

    /** The key identifying the inherited container element. */
    private String m_key;

    /** True if the parent is visible. */
    private boolean m_parentVisible;

    /** The element's own visibility. */
    private Boolean m_visibility;

    /** True if the visibility has been inherited. */
    private boolean m_visibilityInherited;

    /**
     * Creates a new instance.<p>
     */
    public CmsInheritanceInfo() {

    }

    /**
     * Creates a new instance.<p>
     * 
     * @param key the key identifying the container element 
     * @param visibility the visibility of the container element 
     * @param isNew if true, the element is new 
     */
    public CmsInheritanceInfo(String key, Boolean visibility, boolean isNew) {

        m_key = key;
        m_visibility = visibility;
        m_isNew = isNew;
    }

    /**
     * Returns the key identifying the container element.<p>
     * 
     * @return the key 
     */
    public String getKey() {

        return m_key;
    }

    /**
     * Returns the parent configuration's visibility.<p>
     * 
     * @return the parent visibility 
     */
    public boolean getParentVisibility() {

        return m_parentVisible;
    }

    /**
     * Gets the container element's visibility.<p>
     * 
     * @return the container element's visibility 
     */
    public Boolean getVisibility() {

        return m_visibility;
    }

    /**
     * Returns true if this container element is new.<p>
     * 
     * @return true if the container element is new 
     */
    public boolean isNew() {

        return m_isNew;
    }

    /**
     * Sets the 'new' field.<p>
     * 
     * @param isNew the new value for the 'new' field 
     */
    public void setIsNew(boolean isNew) {

        m_isNew = isNew;
    }

    /**
     * Sets the key identifying this container element.<p>
     * 
     * @param key the key identifying the container element 
     */
    public void setKey(String key) {

        m_key = key;
    }

    /**
     * Sets the parent visibility.<p>
     * 
     * @param parentVisible the new value for the parent visibility 
     */
    public void setParentVisible(boolean parentVisible) {

        m_parentVisible = parentVisible;
    }

    /**
     * Sets the new visibility.<p>
     * 
     * @param visibility the new value of the visibility 
     */
    public void setVisibility(Boolean visibility) {

        m_visibility = visibility;
    }

    /** 
     * Sets the 'visibilityInherited' attribute.<p>
     * 
     * @param visibilityInherited the new value of the 'visibilityInherited' attribute
     */
    public void setVisibilityInherited(boolean visibilityInherited) {

        m_visibilityInherited = visibilityInherited;
    }

}
