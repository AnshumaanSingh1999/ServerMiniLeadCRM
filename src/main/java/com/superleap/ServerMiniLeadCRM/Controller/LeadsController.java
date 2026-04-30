package com.superleap.ServerMiniLeadCRM.Controller;

import com.superleap.ServerMiniLeadCRM.Model.Leads;
import com.superleap.ServerMiniLeadCRM.Service.LeadsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeadsController {

    @Autowired
    private LeadsService ls;


    @PostMapping("/leads")
    public Leads CreateLead(@RequestBody Leads OneLead){
        return ls.CreateLead(OneLead);
    }

    @GetMapping("/leads")
    public List<Leads> ListLeads() {
        return ls.ListLeads();
    }

    @PostMapping("/leads/bulk")
    public List<Leads> CreateBulkLeads(@RequestBody List<Leads> ManyLeads){
        return ls.CreateBulkLeads(ManyLeads);
    }

}
