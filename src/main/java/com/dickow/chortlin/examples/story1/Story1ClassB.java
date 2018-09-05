package com.dickow.chortlin.examples.story1;

import com.dickow.chortlin.examples.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("serviceb")
@RestController
public class Story1ClassB {
    private final Logger log;

    @Autowired
    public Story1ClassB(Logger log) {
        this.log = log;
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public void receive(@RequestBody String body){
        log.info(body);
    }
}
