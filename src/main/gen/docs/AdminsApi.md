# AdminsApi

All URIs are relative to *https://virtserver.swaggerhub.com/CINARSENTURK3456/shop-api/1.0.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addInventory**](AdminsApi.md#addInventory) | **POST** /inventory | adds an inventory item |


<a name="addInventory"></a>
# **addInventory**
> addInventory(inventoryItem)

adds an inventory item

Adds an item to the system

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdminsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://virtserver.swaggerhub.com/CINARSENTURK3456/shop-api/1.0.0");

    AdminsApi apiInstance = new AdminsApi(defaultClient);
    InventoryItem inventoryItem = new InventoryItem(); // InventoryItem | Inventory item to add
    try {
      apiInstance.addInventory(inventoryItem);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminsApi#addInventory");
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
| **inventoryItem** | [**InventoryItem**](InventoryItem.md)| Inventory item to add | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | item created |  -  |
| **400** | invalid input, object invalid |  -  |
| **409** | an existing item already exists |  -  |

