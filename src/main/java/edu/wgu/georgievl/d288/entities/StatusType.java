package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

public enum StatusType {
    pending,
    ordered,
    canceled
}

