package com.example.gsuploadingfiles.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class StorageProperties {

    private String location = "upload-dir";
}
