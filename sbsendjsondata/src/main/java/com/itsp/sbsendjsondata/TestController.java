package com.itsp.sbsendjsondata;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/entity")
    public ResponseEntity<Entity> getEntity() {
        Entity entity = new Entity(111, "Ravi", "20000");

        return new ResponseEntity<Entity>(entity, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<AllDataTypeEntity> getAllDataType() {
        AllDataTypeEntity all = new AllDataTypeEntity(1, "Vivek", 1836.2f,
                new String[] { "red", "green", "yellow" },
                List.of("data", "java", "paython"),
                Set.of(55654L, 48575L, 668855L),
                Map.of("Addhar", 12412413412L, "voter", 1231231L),
                new Company("NEC", "Noida", "IT", 4000));

        return new ResponseEntity<AllDataTypeEntity>(all, HttpStatus.OK);
    }

}
