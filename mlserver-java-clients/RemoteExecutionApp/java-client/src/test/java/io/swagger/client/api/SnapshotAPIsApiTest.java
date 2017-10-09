/*
 * DeployRClient
 * Integration technology for deploying R and Python analytics inside web, desktop, mobile, and dashboard applications as well as backend systems. Turn your R or Python scripts into analytics web services, so code can be easily executed by applications running on a secure server.  The core APIs can be grouped into several categories, including: [Authentication](#authentication-apis), [Web Services](#services-management-apis), [Sessions](#session-apis), [Snapshots](#snapshot-apis), [Status](#status-apis), and [Centralized Configuration](#centralized-configuration-apis). 
 *
 * OpenAPI spec version: 9.2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreateSnapshotRequest;
import io.swagger.client.model.CreateSnapshotResponse;
import io.swagger.client.model.Error;
import java.io.File;
import io.swagger.client.model.Snapshot;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SnapshotAPIsApi
 */
@Ignore
public class SnapshotAPIsApiTest {

    private final SnapshotAPIsApi api = new SnapshotAPIsApi();

    
    /**
     * Create Snapshot
     *
     * Create a snapshot from session by saving the workspace and all files in the working directory into zip file, the return value will be the created snapshot Id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSnapshotTest() throws ApiException {
        String id = null;
        CreateSnapshotRequest createSnapshotRequest = null;
        CreateSnapshotResponse response = api.createSnapshot(id, createSnapshotRequest);

        // TODO: test validations
    }
    
    /**
     * Delete Snapshot
     *
     * Delete a snapshot permanently and also it&#39;s content (zip file containing the working directory files and the workspace file)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSnapshotTest() throws ApiException {
        String id = null;
        String response = api.deleteSnapshot(id);

        // TODO: test validations
    }
    
    /**
     * Get Snapshot
     *
     * Get the snapshot content as zip file stream (zip file containing the working directory files and the workspace file)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotContentTest() throws ApiException {
        String id = null;
        File response = api.getSnapshotContent(id);

        // TODO: test validations
    }
    
    /**
     * Get Snapshots
     *
     * List all the snapshots for the current user and display some info such as Id, display name, creation time, zip file size and owner for this snapshot.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSnapshotsTest() throws ApiException {
        List<Snapshot> response = api.listSnapshots();

        // TODO: test validations
    }
    
    /**
     * Load Snapshot
     *
     * Loads a snapshot into session by merging the workspace of the saved snapshot and target session. It will override the files in the working directory as well.   **Note - ** You can only load R snapshots to R session and Python snapshots to a Python session.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loadSnapshotTest() throws ApiException {
        String id = null;
        String snapshotId = null;
        api.loadSnapshot(id, snapshotId);

        // TODO: test validations
    }
    
}