package com.agdb.demoDBapi.repository;

import com.agdb.demoDBapi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
