package com.capitalmaharaja.stitchline.repo

import com.capitalmaharaja.stitchline.entity.Customer
import org.springframework.data.repository.CrudRepository

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 11/26/21
 **/
interface CustomerRepo : CrudRepository<Customer,String> {
}
