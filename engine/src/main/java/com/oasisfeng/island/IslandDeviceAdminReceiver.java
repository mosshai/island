package com.oasisfeng.island;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

import com.oasisfeng.island.provisioning.IslandProvisioning;

/**
 * Handles events related to managed profile.
 */
public class IslandDeviceAdminReceiver extends DeviceAdminReceiver {

    /**
     * Called on the new profile when managed profile provisioning has completed. Managed profile
     * provisioning is the process of setting up the device so that it has a separate profile which
     * is managed by the mobile device management (mdm) application that triggered the provisioning.
     * Note that the managed profile is not fully visible until it is enabled.
     */
    @Override public void onProfileProvisioningComplete(final Context context, final Intent intent) {
        IslandProvisioning.onProfileProvisioningComplete(context);
    }
}