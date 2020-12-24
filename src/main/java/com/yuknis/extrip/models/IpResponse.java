package com.yuknis.extrip.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IpResponse {

    @JsonProperty(value = "ip", required = true)
    String ip;

    public IpResponse() {
    }

    public IpResponse(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IpResponse)) return false;
        IpResponse that = (IpResponse) o;
        return getIp().equals(that.getIp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIp());
    }

    @Override
    public String toString() {
        return "IpResponse{" +
                "ip='" + ip + '\'' +
                '}';
    }
}
