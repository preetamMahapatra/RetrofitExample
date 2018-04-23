package com.pm.retrofitexample.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pm on 23/04/18.
 */

public class CreateUserResponse {

    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;
}
