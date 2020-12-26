package com.yuknis.extrip.streams;

import org.springframework.stereotype.Component;

import java.util.function.Supplier;

public class PublishToIpStream implements Supplier {

    @Override
    public Object get() {
        return "This is a message from the com.yuknis.extrip.streams.PublishToIpStream::get() method.";
    }

}
