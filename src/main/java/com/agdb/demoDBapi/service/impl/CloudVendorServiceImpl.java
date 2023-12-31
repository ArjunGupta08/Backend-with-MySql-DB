package com.agdb.demoDBapi.service.impl;

import com.agdb.demoDBapi.excepton.CloudVendorNotFoundException;
import com.agdb.demoDBapi.model.CloudVendor;
import com.agdb.demoDBapi.repository.CloudVendorRepository;
import com.agdb.demoDBapi.response.ResponseHandler;
import com.agdb.demoDBapi.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted";
    }

    @Override
    public CloudVendor getCloudVendorById(String cloudVendorId) {
        if (cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud vendor does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
