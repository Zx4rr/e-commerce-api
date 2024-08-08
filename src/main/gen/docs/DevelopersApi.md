# DevelopersApi

All URIs are relative to *https://virtserver.swaggerhub.com/CINARSENTURK3456/shop-api/1.0.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchInventory**](DevelopersApi.md#searchInventory) | **GET** /inventory | searches inventory |


<a name="searchInventory"></a>
# **searchInventory**
> List&lt;InventoryItem&gt; searchInventory(searchString, skip, limit)

searches inventory

By passing in the appropriate options, you can search for available inventory in the system 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DevelopersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/CINARSENTURK3456/shop-api/1.0.0");

    DevelopersApi apiInstance = new DevelopersApi(defaultClient);
    String searchString = "searchString_example"; // String | pass an optional search string for looking up inventory
    Integer skip = 56; // Integer | number of records to skip for pagination
    Integer limit = 56; // Integer | maximum number of records to return
    try {
      List<InventoryItem> result = apiInstance.searchInventory(searchString, skip, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevelopersApi#searchInventory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchString** | **String**| pass an optional search string for looking up inventory | [optional] |
| **skip** | **Integer**| number of records to skip for pagination | [optional] |
| **limit** | **Integer**| maximum number of records to return | [optional] |

### Return type

[**List&lt;InventoryItem&gt;**](InventoryItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | search results matching criteria |  -  |
| **400** | bad input parameter |  -  |

