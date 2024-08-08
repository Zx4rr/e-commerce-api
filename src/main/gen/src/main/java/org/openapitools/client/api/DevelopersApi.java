/*
 * Simple Inventory API
 * This is a simple API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: you@your-company.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.InventoryItem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DevelopersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DevelopersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DevelopersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for searchInventory
     * @param searchString pass an optional search string for looking up inventory (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> search results matching criteria </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad input parameter </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchInventoryCall(String searchString, Integer skip, Integer limit, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/inventory";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (searchString != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchString", searchString));
        }

        if (skip != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("skip", skip));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchInventoryValidateBeforeCall(String searchString, Integer skip, Integer limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchInventoryCall(searchString, skip, limit, _callback);
        return localVarCall;

    }

    /**
     * searches inventory
     * By passing in the appropriate options, you can search for available inventory in the system 
     * @param searchString pass an optional search string for looking up inventory (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return List&lt;InventoryItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> search results matching criteria </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad input parameter </td><td>  -  </td></tr>
     </table>
     */
    public List<InventoryItem> searchInventory(String searchString, Integer skip, Integer limit) throws ApiException {
        ApiResponse<List<InventoryItem>> localVarResp = searchInventoryWithHttpInfo(searchString, skip, limit);
        return localVarResp.getData();
    }

    /**
     * searches inventory
     * By passing in the appropriate options, you can search for available inventory in the system 
     * @param searchString pass an optional search string for looking up inventory (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return ApiResponse&lt;List&lt;InventoryItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> search results matching criteria </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad input parameter </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InventoryItem>> searchInventoryWithHttpInfo(String searchString, Integer skip, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = searchInventoryValidateBeforeCall(searchString, skip, limit, null);
        Type localVarReturnType = new TypeToken<List<InventoryItem>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * searches inventory (asynchronously)
     * By passing in the appropriate options, you can search for available inventory in the system 
     * @param searchString pass an optional search string for looking up inventory (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> search results matching criteria </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad input parameter </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchInventoryAsync(String searchString, Integer skip, Integer limit, final ApiCallback<List<InventoryItem>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchInventoryValidateBeforeCall(searchString, skip, limit, _callback);
        Type localVarReturnType = new TypeToken<List<InventoryItem>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
