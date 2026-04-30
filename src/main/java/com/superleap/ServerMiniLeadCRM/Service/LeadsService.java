package com.superleap.ServerMiniLeadCRM.Service;

import com.superleap.ServerMiniLeadCRM.Model.Leads;
import com.superleap.ServerMiniLeadCRM.Repository.LeadsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadsService {
    @Autowired
    private LeadsRepository lr;

    public Leads CreateLead(Leads OneLead){
        return lr.save(OneLead);
    }

    public List<Leads> ListLeads(){
        return lr.findAll();
    }

    public List<Leads> CreateBulkLeads(List<Leads> BulkLeads){
        return lr.saveAll(BulkLeads);
    }


}
