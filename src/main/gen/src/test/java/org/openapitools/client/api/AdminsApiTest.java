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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.InventoryItem;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminsApi
 */
@Disabled
public class AdminsApiTest {

    private final AdminsApi api = new AdminsApi();

    /**
     * adds an inventory item
     *
     * Adds an item to the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addInventoryTest() throws ApiException {
        InventoryItem inventoryItem = null;
        api.addInventory(inventoryItem);
        // TODO: test validations
    }

}
