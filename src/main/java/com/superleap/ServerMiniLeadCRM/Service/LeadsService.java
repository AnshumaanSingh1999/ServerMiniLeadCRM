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
    private Leads getlead;

    public Leads CreateLead(Leads OneLead){
        return lr.save(OneLead);
    }

    public List<Leads> ListLeads(){
        return lr.findAll();
    }

    public List<Leads> CreateBulkLeads(List<Leads> BulkLeads){
        return lr.saveAll(BulkLeads);
    }

    public Leads GetLeadByID(String id){
        return lr.findById(id).orElse(null);
    }

    public String DeleteLeadByID(String id){
        lr.deleteById(id);
        return "Lead Removed";
    }

    public Leads UpdateLeadByID(String id,Leads UpdateLead){
        Leads ExistingLead =lr.findById(id).orElse(null);
        ExistingLead.setName(UpdateLead.getName());
        ExistingLead.setEmail(UpdateLead.getEmail());
        ExistingLead.setPhone(UpdateLead.getPhone());
        ExistingLead.setSource(UpdateLead.getSource());
        return lr.save(ExistingLead);
    }

    public Leads TransitionLead(String id,Leads NewStatus){
        Leads ExistingLead =lr.findById(id).orElse(null);
        ExistingLead.setStatus(NewStatus.getStatus());
        return lr.save(ExistingLead);
    }
}