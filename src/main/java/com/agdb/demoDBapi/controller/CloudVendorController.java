package com.agdb.demoDBapi.controller;

import com.agdb.demoDBapi.model.CloudVendor;
import com.agdb.demoDBapi.response.ResponseHandler;
import com.agdb.demoDBapi.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    CloudVendor cloudVendor;

    // Read specific cloud vendor details from DB
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return ResponseHandler.responseBuilder("Success", HttpStatus.OK , cloudVendorService.getCloudVendorById(vendorId)) ;
    }

    // Read all cloud vendor details from DB
    @GetMapping
    public ResponseEntity<Object> getAllCloudVendorDetails() {
        return ResponseHandler.responseBuilder("Success", HttpStatus.OK , cloudVendorService.getAllCloudVendors());
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Vendor Details Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Vendor Details updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Vendor Details Deleted Successfully";
    }

}
