package com.SpringBootApplication.CloudVendor.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootApplication.CloudVendor.model.CloudVendor;

@RestController
@RequestMapping("/vendorservice")
public class VendorController {

CloudVendor cloudVendor;

/*
  
 Home page link:- [http://localhost:8080/vendorservice] 
 
 */
@GetMapping
public String homepage(){
    return "<html>"+"<h1>"+"You Can Perform Crud Operation"+"</h1>"+"<a href='http://localhost:8080/vendorservice'>"+"Link 1"+"</a>"+"</html>";
}

/*
 
1. Create Module [http://localhost:8080/vendorservice]
use postman to Add data in JSON format.

 */

@PostMapping
public String createVendorServiceApi(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor=cloudVendor;
    return "Record Inserted Successfully.";
}

/*
 
2. Read Module [http://localhost:8080/vendorservice/12345]
use postman to fetch data passing existing id
 */

@GetMapping("{vendorId}")
public CloudVendor getVendorServiceApi(Integer vendorId){
    return cloudVendor;
}

/*
 
3. Update Module [http://localhost:8080/vendorservice]

    use postman to update data in JSON format.
 */

@PutMapping
public String updateVendorServiceApi(@RequestBody CloudVendor cloudVendor){
    this.cloudVendor=cloudVendor;
    return "Record updated Successfully.";
}

/*
 
4. Delete Module [http://localhost:8080/vendorservice/.....]

    Use 'postman' to delete data passing existing id.
 */

 @DeleteMapping("{id}")
 public String deleteVendorServiceApi(Integer id){
    cloudVendor=null;
    return "Record deleted Successfully.";
 }
}