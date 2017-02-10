package com.epseelon

import grails.validation.Validateable

/**
 * Created by sarbogast on 10/02/2017.
 */
class Address implements Validateable {
    String streetAddress
    String postCode
    String city

    static constraints = {
        streetAddress nullable: false
        postCode nullable: false
        city nullable: false
    }
}
