/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ExtendedDatabaseBlobAuditingPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ExtendedServerBlobAuditingPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerBlobAuditingPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.DatabaseBlobAuditingPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.DatabaseOperations;
import com.microsoft.azure.management.sql.v2017_03_01_preview.Databases;
import com.microsoft.azure.management.sql.v2017_03_01_preview.DatabaseVulnerabilityAssessmentRuleBaselines;
import com.microsoft.azure.management.sql.v2017_03_01_preview.DatabaseVulnerabilityAssessments;
import com.microsoft.azure.management.sql.v2017_03_01_preview.DataWarehouseUserActivities;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobAgents;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobCredentials;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobExecutions;
import com.microsoft.azure.management.sql.v2017_03_01_preview.Jobs;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobStepExecutions;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobSteps;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobTargetExecutions;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobTargetGroups;
import com.microsoft.azure.management.sql.v2017_03_01_preview.JobVersions;
import com.microsoft.azure.management.sql.v2017_03_01_preview.LongTermRetentionBackups;
import com.microsoft.azure.management.sql.v2017_03_01_preview.BackupLongTermRetentionPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedBackupShortTermRetentionPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabases;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.RestorableDroppedManagedDatabases;
import com.microsoft.azure.management.sql.v2017_03_01_preview.RestorePoints;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerAutomaticTunings;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerDnsAliases;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ServerSecurityAlertPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseSecurityAlertPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedServerSecurityAlertPolicies;
import com.microsoft.azure.management.sql.v2017_03_01_preview.SensitivityLabels;
import com.microsoft.azure.management.sql.v2017_03_01_preview.RecommendedSensitivityLabels;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedInstanceAdministrators;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Sql resource management.
 */
public final class SqlManager extends ManagerCore<SqlManager, SqlManagementClientImpl> {
    private ExtendedDatabaseBlobAuditingPolicies extendedDatabaseBlobAuditingPolicies;
    private ExtendedServerBlobAuditingPolicies extendedServerBlobAuditingPolicies;
    private ServerBlobAuditingPolicies serverBlobAuditingPolicies;
    private DatabaseBlobAuditingPolicies databaseBlobAuditingPolicies;
    private DatabaseOperations databaseOperations;
    private Databases databases;
    private DatabaseVulnerabilityAssessmentRuleBaselines databaseVulnerabilityAssessmentRuleBaselines;
    private DatabaseVulnerabilityAssessments databaseVulnerabilityAssessments;
    private DataWarehouseUserActivities dataWarehouseUserActivities;
    private JobAgents jobAgents;
    private JobCredentials jobCredentials;
    private JobExecutions jobExecutions;
    private Jobs jobs;
    private JobStepExecutions jobStepExecutions;
    private JobSteps jobSteps;
    private JobTargetExecutions jobTargetExecutions;
    private JobTargetGroups jobTargetGroups;
    private JobVersions jobVersions;
    private LongTermRetentionBackups longTermRetentionBackups;
    private BackupLongTermRetentionPolicies backupLongTermRetentionPolicies;
    private ManagedBackupShortTermRetentionPolicies managedBackupShortTermRetentionPolicies;
    private ManagedDatabases managedDatabases;
    private ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies managedRestorableDroppedDatabaseBackupShortTermRetentionPolicies;
    private RestorableDroppedManagedDatabases restorableDroppedManagedDatabases;
    private RestorePoints restorePoints;
    private ServerAutomaticTunings serverAutomaticTunings;
    private ServerDnsAliases serverDnsAliases;
    private ServerSecurityAlertPolicies serverSecurityAlertPolicies;
    private ManagedDatabaseSecurityAlertPolicies managedDatabaseSecurityAlertPolicies;
    private ManagedServerSecurityAlertPolicies managedServerSecurityAlertPolicies;
    private SensitivityLabels sensitivityLabels;
    private RecommendedSensitivityLabels recommendedSensitivityLabels;
    private ManagedInstanceAdministrators managedInstanceAdministrators;
    /**
    * Get a Configurable instance that can be used to create SqlManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new SqlManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of SqlManager that exposes Sql resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the SqlManager
    */
    public static SqlManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new SqlManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of SqlManager that exposes Sql resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the SqlManager
    */
    public static SqlManager authenticate(RestClient restClient, String subscriptionId) {
        return new SqlManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of SqlManager that exposes Sql management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Sql management API entry points that work across subscriptions
        */
        SqlManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ExtendedDatabaseBlobAuditingPolicies.
     */
    public ExtendedDatabaseBlobAuditingPolicies extendedDatabaseBlobAuditingPolicies() {
        if (this.extendedDatabaseBlobAuditingPolicies == null) {
            this.extendedDatabaseBlobAuditingPolicies = new ExtendedDatabaseBlobAuditingPoliciesImpl(this);
        }
        return this.extendedDatabaseBlobAuditingPolicies;
    }

    /**
     * @return Entry point to manage ExtendedServerBlobAuditingPolicies.
     */
    public ExtendedServerBlobAuditingPolicies extendedServerBlobAuditingPolicies() {
        if (this.extendedServerBlobAuditingPolicies == null) {
            this.extendedServerBlobAuditingPolicies = new ExtendedServerBlobAuditingPoliciesImpl(this);
        }
        return this.extendedServerBlobAuditingPolicies;
    }

    /**
     * @return Entry point to manage ServerBlobAuditingPolicies.
     */
    public ServerBlobAuditingPolicies serverBlobAuditingPolicies() {
        if (this.serverBlobAuditingPolicies == null) {
            this.serverBlobAuditingPolicies = new ServerBlobAuditingPoliciesImpl(this);
        }
        return this.serverBlobAuditingPolicies;
    }

    /**
     * @return Entry point to manage DatabaseBlobAuditingPolicies.
     */
    public DatabaseBlobAuditingPolicies databaseBlobAuditingPolicies() {
        if (this.databaseBlobAuditingPolicies == null) {
            this.databaseBlobAuditingPolicies = new DatabaseBlobAuditingPoliciesImpl(this);
        }
        return this.databaseBlobAuditingPolicies;
    }

    /**
     * @return Entry point to manage DatabaseOperations.
     */
    public DatabaseOperations databaseOperations() {
        if (this.databaseOperations == null) {
            this.databaseOperations = new DatabaseOperationsImpl(this);
        }
        return this.databaseOperations;
    }

    /**
     * @return Entry point to manage Databases.
     */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(this);
        }
        return this.databases;
    }

    /**
     * @return Entry point to manage DatabaseVulnerabilityAssessmentRuleBaselines.
     */
    public DatabaseVulnerabilityAssessmentRuleBaselines databaseVulnerabilityAssessmentRuleBaselines() {
        if (this.databaseVulnerabilityAssessmentRuleBaselines == null) {
            this.databaseVulnerabilityAssessmentRuleBaselines = new DatabaseVulnerabilityAssessmentRuleBaselinesImpl(this);
        }
        return this.databaseVulnerabilityAssessmentRuleBaselines;
    }

    /**
     * @return Entry point to manage DatabaseVulnerabilityAssessments.
     */
    public DatabaseVulnerabilityAssessments databaseVulnerabilityAssessments() {
        if (this.databaseVulnerabilityAssessments == null) {
            this.databaseVulnerabilityAssessments = new DatabaseVulnerabilityAssessmentsImpl(this);
        }
        return this.databaseVulnerabilityAssessments;
    }

    /**
     * @return Entry point to manage DataWarehouseUserActivities.
     */
    public DataWarehouseUserActivities dataWarehouseUserActivities() {
        if (this.dataWarehouseUserActivities == null) {
            this.dataWarehouseUserActivities = new DataWarehouseUserActivitiesImpl(this);
        }
        return this.dataWarehouseUserActivities;
    }

    /**
     * @return Entry point to manage JobAgents.
     */
    public JobAgents jobAgents() {
        if (this.jobAgents == null) {
            this.jobAgents = new JobAgentsImpl(this);
        }
        return this.jobAgents;
    }

    /**
     * @return Entry point to manage JobCredentials.
     */
    public JobCredentials jobCredentials() {
        if (this.jobCredentials == null) {
            this.jobCredentials = new JobCredentialsImpl(this);
        }
        return this.jobCredentials;
    }

    /**
     * @return Entry point to manage JobExecutions.
     */
    public JobExecutions jobExecutions() {
        if (this.jobExecutions == null) {
            this.jobExecutions = new JobExecutionsImpl(this);
        }
        return this.jobExecutions;
    }

    /**
     * @return Entry point to manage Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(this);
        }
        return this.jobs;
    }

    /**
     * @return Entry point to manage JobStepExecutions.
     */
    public JobStepExecutions jobStepExecutions() {
        if (this.jobStepExecutions == null) {
            this.jobStepExecutions = new JobStepExecutionsImpl(this);
        }
        return this.jobStepExecutions;
    }

    /**
     * @return Entry point to manage JobSteps.
     */
    public JobSteps jobSteps() {
        if (this.jobSteps == null) {
            this.jobSteps = new JobStepsImpl(this);
        }
        return this.jobSteps;
    }

    /**
     * @return Entry point to manage JobTargetExecutions.
     */
    public JobTargetExecutions jobTargetExecutions() {
        if (this.jobTargetExecutions == null) {
            this.jobTargetExecutions = new JobTargetExecutionsImpl(this);
        }
        return this.jobTargetExecutions;
    }

    /**
     * @return Entry point to manage JobTargetGroups.
     */
    public JobTargetGroups jobTargetGroups() {
        if (this.jobTargetGroups == null) {
            this.jobTargetGroups = new JobTargetGroupsImpl(this);
        }
        return this.jobTargetGroups;
    }

    /**
     * @return Entry point to manage JobVersions.
     */
    public JobVersions jobVersions() {
        if (this.jobVersions == null) {
            this.jobVersions = new JobVersionsImpl(this);
        }
        return this.jobVersions;
    }

    /**
     * @return Entry point to manage LongTermRetentionBackups.
     */
    public LongTermRetentionBackups longTermRetentionBackups() {
        if (this.longTermRetentionBackups == null) {
            this.longTermRetentionBackups = new LongTermRetentionBackupsImpl(this);
        }
        return this.longTermRetentionBackups;
    }

    /**
     * @return Entry point to manage BackupLongTermRetentionPolicies.
     */
    public BackupLongTermRetentionPolicies backupLongTermRetentionPolicies() {
        if (this.backupLongTermRetentionPolicies == null) {
            this.backupLongTermRetentionPolicies = new BackupLongTermRetentionPoliciesImpl(this);
        }
        return this.backupLongTermRetentionPolicies;
    }

    /**
     * @return Entry point to manage ManagedBackupShortTermRetentionPolicies.
     */
    public ManagedBackupShortTermRetentionPolicies managedBackupShortTermRetentionPolicies() {
        if (this.managedBackupShortTermRetentionPolicies == null) {
            this.managedBackupShortTermRetentionPolicies = new ManagedBackupShortTermRetentionPoliciesImpl(this);
        }
        return this.managedBackupShortTermRetentionPolicies;
    }

    /**
     * @return Entry point to manage ManagedDatabases.
     */
    public ManagedDatabases managedDatabases() {
        if (this.managedDatabases == null) {
            this.managedDatabases = new ManagedDatabasesImpl(this);
        }
        return this.managedDatabases;
    }

    /**
     * @return Entry point to manage ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies.
     */
    public ManagedRestorableDroppedDatabaseBackupShortTermRetentionPolicies managedRestorableDroppedDatabaseBackupShortTermRetentionPolicies() {
        if (this.managedRestorableDroppedDatabaseBackupShortTermRetentionPolicies == null) {
            this.managedRestorableDroppedDatabaseBackupShortTermRetentionPolicies = new ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesImpl(this);
        }
        return this.managedRestorableDroppedDatabaseBackupShortTermRetentionPolicies;
    }

    /**
     * @return Entry point to manage RestorableDroppedManagedDatabases.
     */
    public RestorableDroppedManagedDatabases restorableDroppedManagedDatabases() {
        if (this.restorableDroppedManagedDatabases == null) {
            this.restorableDroppedManagedDatabases = new RestorableDroppedManagedDatabasesImpl(this);
        }
        return this.restorableDroppedManagedDatabases;
    }

    /**
     * @return Entry point to manage RestorePoints.
     */
    public RestorePoints restorePoints() {
        if (this.restorePoints == null) {
            this.restorePoints = new RestorePointsImpl(this);
        }
        return this.restorePoints;
    }

    /**
     * @return Entry point to manage ServerAutomaticTunings.
     */
    public ServerAutomaticTunings serverAutomaticTunings() {
        if (this.serverAutomaticTunings == null) {
            this.serverAutomaticTunings = new ServerAutomaticTuningsImpl(this);
        }
        return this.serverAutomaticTunings;
    }

    /**
     * @return Entry point to manage ServerDnsAliases.
     */
    public ServerDnsAliases serverDnsAliases() {
        if (this.serverDnsAliases == null) {
            this.serverDnsAliases = new ServerDnsAliasesImpl(this);
        }
        return this.serverDnsAliases;
    }

    /**
     * @return Entry point to manage ServerSecurityAlertPolicies.
     */
    public ServerSecurityAlertPolicies serverSecurityAlertPolicies() {
        if (this.serverSecurityAlertPolicies == null) {
            this.serverSecurityAlertPolicies = new ServerSecurityAlertPoliciesImpl(this);
        }
        return this.serverSecurityAlertPolicies;
    }

    /**
     * @return Entry point to manage ManagedDatabaseSecurityAlertPolicies.
     */
    public ManagedDatabaseSecurityAlertPolicies managedDatabaseSecurityAlertPolicies() {
        if (this.managedDatabaseSecurityAlertPolicies == null) {
            this.managedDatabaseSecurityAlertPolicies = new ManagedDatabaseSecurityAlertPoliciesImpl(this);
        }
        return this.managedDatabaseSecurityAlertPolicies;
    }

    /**
     * @return Entry point to manage ManagedServerSecurityAlertPolicies.
     */
    public ManagedServerSecurityAlertPolicies managedServerSecurityAlertPolicies() {
        if (this.managedServerSecurityAlertPolicies == null) {
            this.managedServerSecurityAlertPolicies = new ManagedServerSecurityAlertPoliciesImpl(this);
        }
        return this.managedServerSecurityAlertPolicies;
    }

    /**
     * @return Entry point to manage SensitivityLabels.
     */
    public SensitivityLabels sensitivityLabels() {
        if (this.sensitivityLabels == null) {
            this.sensitivityLabels = new SensitivityLabelsImpl(this);
        }
        return this.sensitivityLabels;
    }

    /**
     * @return Entry point to manage RecommendedSensitivityLabels.
     */
    public RecommendedSensitivityLabels recommendedSensitivityLabels() {
        if (this.recommendedSensitivityLabels == null) {
            this.recommendedSensitivityLabels = new RecommendedSensitivityLabelsImpl(this);
        }
        return this.recommendedSensitivityLabels;
    }

    /**
     * @return Entry point to manage ManagedInstanceAdministrators.
     */
    public ManagedInstanceAdministrators managedInstanceAdministrators() {
        if (this.managedInstanceAdministrators == null) {
            this.managedInstanceAdministrators = new ManagedInstanceAdministratorsImpl(this);
        }
        return this.managedInstanceAdministrators;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public SqlManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return SqlManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private SqlManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new SqlManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
