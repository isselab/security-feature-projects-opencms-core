/*
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (c) Alkacon Software GmbH & Co. KG (http://www.alkacon.com)
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

package org.opencms.ui.apps.filehistory;

import org.opencms.file.CmsObject;
import org.opencms.main.OpenCms;
import org.opencms.security.CmsRole;
import org.opencms.ui.FontOpenCms;
import org.opencms.ui.apps.A_CmsWorkplaceAppConfiguration;
import org.opencms.ui.apps.CmsAppVisibilityStatus;
import org.opencms.ui.apps.I_CmsWorkplaceApp;
import org.opencms.ui.apps.Messages;
import org.opencms.ui.components.OpenCmsTheme;

import java.util.Locale;

import com.vaadin.server.Resource;

/**
 * Configuration class of file history app.
 */
public class CmsFileHistoryConfiguration extends A_CmsWorkplaceAppConfiguration {

    /** The app id. */
    public static final String APP_ID = "file-history";

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getAppCategory()
     */
    @Override
    public String getAppCategory() {

        return CmsFileHistoryFolder.ID;
    }

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getAppInstance()
     */
    public I_CmsWorkplaceApp getAppInstance() {

        return new CmsFileHistoryApp();
    }

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getButtonStyle()
     */
    @Override
    public String getButtonStyle() {

        return FontOpenCms.SETTINGS.getButtonOverlayStyle() + " " + OpenCmsTheme.BUTTON_OVERLAY_BLUE;
    }

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getHelpText(java.util.Locale)
     */
    @Override
    public String getHelpText(Locale locale) {

        return Messages.get().getBundle(locale).key(Messages.GUI_FILEHISTORY_TOOL_NAME_HELP_0);
    }

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getIcon()
     */
    public Resource getIcon() {

        return CmsFileHistoryFolder.ICON;
    }

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getId()
     */
    public String getId() {

        return APP_ID;
    }

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getName(java.util.Locale)
     */
    @Override
    public String getName(Locale locale) {

        return Messages.get().getBundle(locale).key(Messages.GUI_FILEHISTORY_TOOL_NAME_0);
    }

    /**
     * @see org.opencms.ui.apps.I_CmsWorkplaceAppConfiguration#getOrder()
     */
    @Override
    public int getOrder() {

        return 8;
    }

    /**
     * @see org.opencms.ui.apps.A_CmsWorkplaceAppConfiguration#getVisibility(org.opencms.file.CmsObject)
     */
    @Override
    public CmsAppVisibilityStatus getVisibility(CmsObject cms) {

        CmsAppVisibilityStatus status = OpenCms.getRoleManager().hasRole(cms, CmsRole.WORKPLACE_MANAGER)
        ? CmsAppVisibilityStatus.ACTIVE
        : CmsAppVisibilityStatus.INVISIBLE;
        return status;
    }
}
