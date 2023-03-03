package com.ralliv.kotlinspringrest.model


data class Ob( var id: String, var name: String, var desc: String)

/*
* The above is the same as below (java)
*
*

class Ob(public var id: String, public var name: String, public var description: String) {

    fun getId(): String {
        return this.id
    }

    fun setId(id: String) {
        this.id = id
    }

    // objects nature comparison: Indicates whether some other object is "equal to" this one
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    // Returns a hash code value for the object
    override fun hashCode(): Int {
        return super.hashCode()
    }

    // Returns a string representation of the object
    override fun toString(): String {
        return super.toString()
    }
}

* * */