package com.jobiak.rest.resources;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobiak.rest.model.Mobile;
import com.jobiak.rest.service.MobileService;

@RestController
@RequestMapping("/catalog")
public class Product {
	
@GetMapping(value="/mobile",produces=MediaType.APPLICATION_JSON_VALUE)
public Mobile showCatalog() {
Mobile mobile=new Mobile();
mobile.setBrand("samsung");
mobile.setModel("E2FH.Dual camera");
mobile.setPrice(488888);
return mobile;
}
@GetMapping("/intro")
public String introduction() {
	return new String("Hi this is #1 model in Asia");
}
@GetMapping("/search/{modelId}")
public String searchModel(@PathVariable(value="modelId") String modelId) {
	return new String(modelId+"is available in blue and black colors");
}
@GetMapping("/search/{modelId}/{name}")
public String searchName(@PathVariable String modelId ,@PathVariable String name) {
	return modelId+"is the model "+name+" is available " ;
}
@Autowired 
MobileService service;
@PostMapping(value="/create",consumes= MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
public Mobile addProduct(@RequestBody Mobile mobile) {
	//System.out.println(mobile);
	Mobile ref=service.addMobile(mobile);
	return ref;
}
@PutMapping(value="/modify",consumes= MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
public Mobile modifyProduct(@RequestBody Mobile mobile) {
	Mobile ref=service.modifyMobile(mobile);
	return ref;
}
@DeleteMapping("/remove/{mid}")
public void removeProduct(@PathVariable Long mid) {
	service.removeProduct(mid);
}
@GetMapping(value="/display",produces= MediaType.APPLICATION_JSON_VALUE)
public List<Mobile>showAll(){
	return service.getAll();
}

@GetMapping(value="/identify/{mid}",produces= MediaType.APPLICATION_JSON_VALUE)
public Optional<Mobile> showAll(@PathVariable Long mid){
	return service.show(mid);
}

}
