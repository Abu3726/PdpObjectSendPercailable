package com.conamobile.pdpobjectsendpercailable.models

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator


class User : Parcelable {
    var name: String?
    var age: String?

    // Constructor
    constructor(id: Long, name: String?, age: String?) {
        this.name = name
        this.age = age
    }

    // Parcelling part
    constructor(`in`: Parcel) {
        name = `in`.readString()
        age = `in`.readString()
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeString(age)
    }

    override fun toString(): String {
        return "Age: $age\nName: $name"
    }

    companion object {
        val CREATOR: Creator<*> = object : Creator<Any?> {
            override fun createFromParcel(`in`: Parcel): User? {
                return User(`in`)
            }

            override fun newArray(size: Int): Array<User?> {
                return arrayOfNulls(size)
            }
        }
    }

    object CREATOR : Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}