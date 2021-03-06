/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import rx.Completable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.BackupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Backups.
 */
public interface Backups extends HasInner<BackupsInner> {
    /**
     * Triggers the backup job for the specified backup item. This is an asynchronous operation. To know the status of the operation, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup item.
     * @param containerName The container name associated with the backup item.
     * @param protectedItemName The name of backup item used in this POST operation.
     * @param resourceBackupRequest The resource backup request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable triggerAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, BackupRequestResource resourceBackupRequest);

}
