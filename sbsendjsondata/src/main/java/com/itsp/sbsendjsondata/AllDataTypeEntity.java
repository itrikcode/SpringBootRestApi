package com.itsp.sbsendjsondata;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllDataTypeEntity {
    private int pno;
    private String pname;
    private Float billAmt;
    private String[] favColor;
    private List<String> studies;
    private Set<Long> phoneNumber;
    private Map<String, Object> idDetails;

    private Company company;
}
