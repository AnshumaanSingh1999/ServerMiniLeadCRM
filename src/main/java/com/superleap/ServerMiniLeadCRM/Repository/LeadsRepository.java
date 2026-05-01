package com.superleap.ServerMiniLeadCRM.Repository;

import com.superleap.ServerMiniLeadCRM.Enums.Status;
import com.superleap.ServerMiniLeadCRM.Model.Leads;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeadsRepository extends JpaRepository<Leads,String> {

    List<Leads> findAllByStatus(Status status);
}
