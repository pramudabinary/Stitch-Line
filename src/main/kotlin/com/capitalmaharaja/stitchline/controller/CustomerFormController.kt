package com.capitalmaharaja.stitchline.controller

import com.capitalmaharaja.stitchline.entity.Customer
import com.capitalmaharaja.stitchline.repo.CustomerRepo
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 11/26/21
 **/

@RestController
@RequestMapping("/api/v1/customer")
class CustomerFormController (val repo : CustomerRepo) {

    @PostMapping("/crud/save")
    fun saveCustomer(@RequestBody customer : Customer){
        repo.save(customer)
    }

}
