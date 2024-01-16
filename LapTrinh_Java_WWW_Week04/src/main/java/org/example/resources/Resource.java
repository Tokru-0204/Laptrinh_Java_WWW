package org.example.resources;

import org.springframework.core.io.ClassPathResource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class Resource {
    private org.springframework.core.io.Resource resource;

    public Resource(String path) {
        this.resource = new ClassPathResource(path);
    }

    public InputStream getInputStream() throws IOException {
        return resource.getInputStream();
    }

    public byte[] readBytes() throws IOException {
        try (InputStream inputStream = getInputStream()) {
            return inputStream.readAllBytes();
        }
    }

    public String readAsString() throws IOException {
        return new String(readBytes());
    }

    public File getFile() throws IOException {
        return resource.getFile();
    }

    public Resource getResource() {
        return (Resource) resource;
    }
}

