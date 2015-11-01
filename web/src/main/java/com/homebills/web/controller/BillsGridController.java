package com.homebills.web.controller;

import com.homebills.entities.representation.BillRO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

/**
 * Created by maksm_000 on 03.08.2015.
 */
@Controller
@RequestMapping(value = "bill")
public class BillsGridController {

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<BillRO> getBills(@RequestParam long categoryId, @RequestParam int limit, @RequestParam(value = "start") int offset,
                          @RequestParam String sort, @RequestParam String dir) {
        return Collections.EMPTY_LIST;
    }
}