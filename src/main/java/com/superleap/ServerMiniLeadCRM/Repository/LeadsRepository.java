package com.superleap.ServerMiniLeadCRM.Repository;

import com.superleap.ServerMiniLeadCRM.Model.Leads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadsRepository extends JpaRepository<Leads,String> {
}
