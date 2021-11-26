package com.capitalmaharaja.stitchline.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.Id

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 11/23/21
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
class Admin (
        @Id
        var id: String,
        val name: String,
        val nic: String,
        val emp_num: String,
        val email: String?,
        val contact: String?,
        val username: String?,
        val password: String?,
)
