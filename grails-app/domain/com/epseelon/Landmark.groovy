package com.epseelon

class Landmark {
    static embedded = ['address']

    String title
    Address address

    static constraints = {
        title nullable: true
    }
}
