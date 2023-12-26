package com.agdb.demoDBapi.service;

import com.agdb.demoDBapi.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendorById(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
