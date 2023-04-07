package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author TemmyTechie
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public record Value(Long id, String quote){

}