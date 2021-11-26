package com.capitalmaharaja.stitchline.repo

import com.capitalmaharaja.stitchline.entity.Admin
import org.springframework.data.repository.CrudRepository

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 11/26/21
 **/
interface AdminRepo : CrudRepository<Admin,String> {
}
